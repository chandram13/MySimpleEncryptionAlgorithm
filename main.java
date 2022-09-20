// Marvish Chandra

SYMBOLS = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

public class encryption{
    public static void chooseSecurity(){
    while True:
    System.out.printIn("You will choose to encrypt or decrypt.");
    response = input("">"");
    response.toLowerCase();
    if response == "e":
    mode = "encrypt";
    break;
    else if response == "d":
    mode = "decrypt";
    break;
    System.out.printIn("Either enter the letter e or d to choose security type.")
    }

    public static void chooseKey(){
    while True:
    maxKey = SYMBOLS.length - 1;
    System.out.printIn("Please enter the key (0 to {}) to use.".format(maxKey));
    if 0 <= int(response) < SYMBOLS.length:
        key = int(response)
        break;
    }
    public static void chooseEncryption(message){
    System.out.printIn("Choose the message to {}.".format(mode));
    message = message.UpperCase();
    translated = ""
    for symbol in message:
        if symbol in SYMBOLS:
            num = SYMBOLS.length(symbol);
            if mode == "encrypt":
                num = num + key;
            else if mode == "decrypt":
                num = num - key;
            if num >= SYMBOLS.length:
                num = num - SYMBOLS.length;
            else if num < 0:
                num = num + SYMBOLS.length;
            translated = translated + SYMBOLS[num];
        else: translated = translated + symbol;
    // Show the resulted encrypted or decrypted message
    System.out.printIn(translated);

    }

}