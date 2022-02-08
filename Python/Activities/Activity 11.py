fruit_shop = {
    "mango": 12,
    "grapes": 30,
    "banana": 6,
    "orange": 12
}

key = input("Item to check ").lower()

if(key in fruit_shop):
    print("Yes, Fruit is available")
else:
    print("No, Fruit is not available")