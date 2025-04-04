package kr.co.greenuniv.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommunityInfo is a Querydsl query type for CommunityInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommunityInfo extends EntityPathBase<CommunityInfo> {

    private static final long serialVersionUID = -1835638260L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommunityInfo communityInfo = new QCommunityInfo("communityInfo");

    public final NumberPath<Integer> CinforId = createNumber("CinforId", Integer.class);

    public final StringPath company = createString("company");

    public final StringPath content = createString("content");

    public final StringPath deadline = createString("deadline");

    public final NumberPath<Integer> hit = createNumber("hit", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath title = createString("title");

    public final QUser user;

    public final DateTimePath<java.time.LocalDateTime> wdate = createDateTime("wdate", java.time.LocalDateTime.class);

    public QCommunityInfo(String variable) {
        this(CommunityInfo.class, forVariable(variable), INITS);
    }

    public QCommunityInfo(Path<? extends CommunityInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommunityInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommunityInfo(PathMetadata metadata, PathInits inits) {
        this(CommunityInfo.class, metadata, inits);
    }

    public QCommunityInfo(Class<? extends CommunityInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

