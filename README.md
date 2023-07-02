# java-99-bottles

Code kata to refactor the famous "99 Bottles of Beer" song generator

# Questions to discuss

- Почему тест для метода `song()` такой длинный? Не лучше ли было написать его вот так: 
```java
class BottlesTest {
    @Test
    void testSong() {
        Bottles bottles = new Bottles();
        assertThat(bottles.song()).isEqualTo(bottles.verses(99, 0));
    }
}
```

- Зачем вообще нужен метод `song()`? Он всего лишь делегирует выполнение методу `verses(99, 0)`, который уже есть в 
- публичном API, так каков смысл иметь еще один метод для того же самого?
- Лучше ли использовать `switch` вместо `if` в методе `verse()`?
- 