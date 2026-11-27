@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(100000);
    assertEquals ("Ожидалось, что вернется true", true, isAdult);
}
