// Marvish Chandra



public class encryption{
    public static void chooseSecurity(){
    while True:
    System.out.printIn("You will choose to encrypt or decrypt.");
    response = input(">");
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
    public static void chooseEncryption(givenMessage){
    SYMBOLS = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    System.out.printIn("Choose the message to {}.".format(mode));
    givenMessage = givenMessage.UpperCase();
    translatedMessage = ""
    for symbol in givenMessage:
        if symbol in SYMBOLS:
            symNum = SYMBOLS.length(symbol);
            if mode == "encrypt":
                symNum = symNum + key;
            else if mode == "decrypt":
                symNum = symNum - key;
            if symNum >= SYMBOLS.length:
                symNum = symNum - SYMBOLS.length;
            else if symNum < 0:
                symNum = symNum + SYMBOLS.length;
            translated = translated + SYMBOLS[symNum];
        else: translated = translated + symbol;
    // Show the resulted encrypted or decrypted message
    System.out.printIn(translated);

    }

}