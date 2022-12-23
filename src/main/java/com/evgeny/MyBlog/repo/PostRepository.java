package com.evgeny.MyBlog.repo;

import com.evgeny.MyBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
