package kr.co.greenuniv.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCourse is a Querydsl query type for Course
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCourse extends EntityPathBase<Course> {

    private static final long serialVersionUID = -202235930L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCourse course = new QCourse("course");

    public final StringPath cor_book = createString("cor_book");

    public final StringPath cor_class = createString("cor_class");

    public final StringPath cor_code = createString("cor_code");

    public final StringPath cor_description = createString("cor_description");

    public final StringPath cor_evalMethod = createString("cor_evalMethod");

    public final StringPath cor_grade = createString("cor_grade");

    public final StringPath cor_lecName = createString("cor_lecName");

    public final StringPath cor_maxEnrolment = createString("cor_maxEnrolment");

    public final StringPath cor_point = createString("cor_point");

    public final StringPath cor_professor = createString("cor_professor");

    public final StringPath cor_type = createString("cor_type");

    public final QDepartment department;

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final TimePath<java.time.LocalTime> endTime = createTime("endTime", java.time.LocalTime.class);

    public final StringPath lectureDays = createString("lectureDays");

    public final StringPath semester = createString("semester");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final TimePath<java.time.LocalTime> startTime = createTime("startTime", java.time.LocalTime.class);

    public final QUniversity university;

    public QCourse(String variable) {
        this(Course.class, forVariable(variable), INITS);
    }

    public QCourse(Path<? extends Course> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCourse(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCourse(PathMetadata metadata, PathInits inits) {
        this(Course.class, metadata, inits);
    }

    public QCourse(Class<? extends Course> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department"), inits.get("department")) : null;
        this.university = inits.isInitialized("university") ? new QUniversity(forProperty("university")) : null;
    }

}

