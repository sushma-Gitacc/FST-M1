
import pytest


def test_addition():


    num1 = 10
    num2 = 15
    sum = num1 + num2


    assert sum == 25


def test_subtraction():


    num1 = 80
    num2 = 10


    diff = num1 - num2
    assert diff == 70


@pytest.mark.activity
def test_multiplication():

    num1 = 29
    num2 = 34
    prod = num1 * num2
    assert prod == 986


@pytest.mark.activity
def test_division():

    num1 = 40
    num2 = 4
    quot = num1 / num2

    assert quot == 10
