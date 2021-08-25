# Junit 5

## Assertions

it mostly takes expected and actual value .

```java
private Demo demo;

	@Before
	public void setUp() throws Exception {
		demo = new Demo("test", "case");
	}

		@Test
	public void testLength() {
		assertEquals(8, demo.lengthOfString());
		assertNotNull(demo.getS1(),"value is not null");
	}
```
### assertNull and assertEmpty

corner cases : when you get an empty String or null value .
    
```java

    @Test
	public void testFalseAndTrue() {
		assertFalse(demo.getS1().length()<1);
	}

```

### assert Arrays

just same as before .

### @BeforeEach(JUnit5)/@Before(JUnit4) 

```java
//in JUnit 4
@Before
	public void setUp() throws Exception {
		demo = new Demo("test", "case");
		System.out.println("initializing before each");
	}

//in Junit5
@BeforeEach
	public void setUp(TestInfo info) throws Exception {
		demo = new Demo("test", "case");
		System.out.println("initializing before each"+info.getDisplayName());
	}

```

### @AfterEach(JUnit5)/@After(JUnit4)
```java
@After
	public void afterVal() {
		System.out.println("initializing after each ...");
	}

// in junit 5

@AfterEach
	public void afterVal(TestInfo info) {
		System.out.println("initializing after each ..."+info.getDisplayName());
	}
```

### @BeforeAll(JUnit5)/@AfterClass(JUnit4)

in Junit 4 the @BeforeClass expects a static method

```java
@BeforeClass
	public static void beforeVal() {
		System.out.println("initializing before all...");
	}

@AfterClass
	public static void afterAll() {
		System.out.println("initializing after all...");
	}

```


for catching exception use "assertThrows()" .

## @DisplayName and test methods need not be public
in junit 5 we can annotate the method with @DisplayName(String value) to make the test scenarios more user readable .


## Basics of Parameterized test 

lets say there are multiple arguments that needs to be tested then we used to write as below

```java
@Test
	public void testArgs() {
		assertTrue(demo.getS1().length()>0);
		assertTrue(demo.getS2().length()>0);
        assertTrue(demo.getS3().length()>0);
		assertTrue(demo.getS4().length()>0);
        //....so on
	}
```
however now we can pass in the arguments as such 

```java
@ParameterizdTest
@ValueSource(values={"Ansfa","asflfjka","lajflak"})
public void testArgs(String str) {
		assertTrue(str.length()>0);

```