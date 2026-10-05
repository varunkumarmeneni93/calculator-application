let display = document.getElementById("display");

function appendValue(value) {
    display.value += value;
}

function clearDisplay() {
    display.value = "";
}

function deleteLast() {
    display.value = display.value.slice(0, -1);
}

function calculate() {
    try {
        let expression = display.value;

        if (expression === "") {
            return;
        }

        display.value = eval(expression);
    } catch (error) {
        display.value = "Error";
    }
}