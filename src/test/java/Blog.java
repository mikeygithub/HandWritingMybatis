import java.io.Serializable;

/**
 * @Program: MybatisDemo
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-08 16:15
 * @Describe：
 **/
public class Blog implements Serializable {
    private String blogId;
    private String blogTitle;
    private String blogContent;
    private String blogAuthod;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogAuthod() {
        return blogAuthod;
    }

    public void setBlogAuthod(String blogAuthod) {
        this.blogAuthod = blogAuthod;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId='" + blogId + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", blogAuthod='" + blogAuthod + '\'' +
                '}';
    }
}
