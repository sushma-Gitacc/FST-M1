import pytest

# Create fixture
@pytest.fixture
def num_list():


    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    return list

# Write test method
def test_sum(num_list):


    sum = 0


    for i in num_list:
        sum += i

    assert sum == 55