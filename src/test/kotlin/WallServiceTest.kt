import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        val result = WallService.add(Post(0, text = "Text1")).id
        assertNotEquals(0,result)
    }

    @Test
    fun updatePostTrue() {
        WallService.clear()
        WallService.add(Post(text = "Text1"))
        WallService.add(Post(text = "Text2"))
        val result = WallService.update(Post(2, text = "Text2 update"))
        assertTrue(result)
    }

    @Test
    fun updatePostFalse() {
        WallService.clear()
        WallService.add(Post(text = "Text 1"))
        WallService.add(Post(text = "Text 2"))
        val result = WallService.update(Post(3, text = "Text2 update"))
        assertFalse(result)
    }
}