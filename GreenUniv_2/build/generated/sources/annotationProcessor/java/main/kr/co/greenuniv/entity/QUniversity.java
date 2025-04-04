package kr.co.greenuniv.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUniversity is a Querydsl query type for University
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUniversity extends EntityPathBase<University> {

    private static final long serialVersionUID = -479376167L;

    public static final QUniversity university = new QUniversity("university");

    public final StringPath univEngName = createString("univEngName");

    public final StringPath univIntroContent = createString("univIntroContent");

    public final StringPath univIntroFile = createString("univIntroFile");

    public final StringPath univIntroTitle = createString("univIntroTitle");

    public final StringPath univName = createString("univName");

    public QUniversity(String variable) {
        super(University.class, forVariable(variable));
    }

    public QUniversity(Path<? extends University> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUniversity(PathMetadata metadata) {
        super(University.class, metadata);
    }

}

