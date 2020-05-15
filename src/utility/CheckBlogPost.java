/*package utility;

import java.util.Arrays;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String[] badwords = {"ahole","bitch","cock","dick","erotic","fcuk","gay","heroin","injun","jerk","kill","lesbo","murder","niggle","orally","pawn","quicky","racy","sadist","teez","uterus","virgin","weed","xxx","yobbo","zibbi"};
	public boolean checkBlogTitle(Blog blog) {
		boolean contains = Arrays.stream(badwords).anyMatch(blog.getBlogTitle()::equals);
		contains = !contains;
		return contains;
	}

	public boolean checkBlogDescription(Blog blog) {
		boolean val = Arrays.stream(badwords).anyMatch(blog.getBlogDescription()::equals);
		val = !val;
		return val;
	}

	public boolean checkBlog(Blog blog) {
		boolean flag = (checkBlogTitle(blog) && checkBlogDescription(blog));
		return flag;
	}
	
}
*/

package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{

	String[] bad_words = {"ahole","bitch","cock","dick","erotic","fcuk","gay","heroin","injun","jerk","kill","lesbo","murder","niggle","orally","pawn","quicky","racy","sadist","teez","uterus","virgin","weed","xxx","yobbo","zibbi"};
	@Override
	public boolean checkBlog(Blog blog) {
		
		if (checkBlogTitle(blog) && checkBlogDescription(blog))
			return true;
		else
			return false;
	}
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		
		String title = blog.getBlogTitle();
		int i=0;
		while(i < bad_words.length)
		{
			if(title.contains(bad_words[i]))
				return false;
		}
		return true;	
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String desc = blog.getBlogDescription();
		int i=0;
		while(i < bad_words.length)
		{
			if(desc.contains(bad_words[i]))
				return false;
		}
		return true;
	}
	
}