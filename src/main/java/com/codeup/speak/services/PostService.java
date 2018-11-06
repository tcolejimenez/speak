package com.codeup.speak.services;

import com.codeup.speak.models.Post;
import com.codeup.speak.services.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
//    private List<Post> posts;
    private PostRepository postRepo;

    public PostService(PostRepository postRepo) {
        this.postRepo = postRepo;

//        posts = new ArrayList<Post>();
//        createPosts();
    }

    public Iterable<Post> findAll() {
        return postRepo.findAll();
    }

    public Post findOne(long id) {
//        return posts.get((int) id - 1);
        return postRepo.findById(id).get();
    }


    public Post save(Post post) {
//        post.setId(posts.size() + 1);
//        posts.add(post);
//        return post;
        return postRepo.save(post);
    }


    private void createPosts() {
        save(new Post("a good one", "soooo gooood"));
        save(new Post("a really good one", "Like even better?"));
    }
}
