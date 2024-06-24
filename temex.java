public static <T> int getNotNullFieldCount(T object) {
    int count = 0;
    for (Field field : object.getClass().getDeclaredFields()) {
        field.setAccessible(true);
        try {
            if (field.get(object) != null) {
                count++;
            }
        } catch (IllegalAccessException e) {
            // Handle exception
        }
    }
    return count;
}
