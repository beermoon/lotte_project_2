package kr.co.greenuniv.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudent is a Querydsl query type for Student
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudent extends EntityPathBase<Student> {

    private static final long serialVersionUID = -516473904L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudent student = new QStudent("student");

    public final StringPath admissionGrade = createString("admissionGrade");

    public final StringPath admissionSemester = createString("admissionSemester");

    public final StringPath admissionType = createString("admissionType");

    public final NumberPath<Integer> admissionYear = createNumber("admissionYear", Integer.class);

    public final QDepartment department;

    public final StringPath gender = createString("gender");

    public final NumberPath<Integer> graduationYear = createNumber("graduationYear", Integer.class);

    public final QProfessor professor;

    public final StringPath S_addr1 = createString("S_addr1");

    public final StringPath S_addr2 = createString("S_addr2");

    public final StringPath S_email = createString("S_email");

    public final StringPath S_Ename = createString("S_Ename");

    public final StringPath S_hp = createString("S_hp");

    public final StringPath S_name = createString("S_name");

    public final StringPath S_nation = createString("S_nation");

    public final StringPath S_num = createString("S_num");

    public final StringPath S_residentId = createString("S_residentId");

    public final StringPath status = createString("status");

    public final QUniversity university;

    public QStudent(String variable) {
        this(Student.class, forVariable(variable), INITS);
    }

    public QStudent(Path<? extends Student> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudent(PathMetadata metadata, PathInits inits) {
        this(Student.class, metadata, inits);
    }

    public QStudent(Class<? extends Student> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department"), inits.get("department")) : null;
        this.professor = inits.isInitialized("professor") ? new QProfessor(forProperty("professor"), inits.get("professor")) : null;
        this.university = inits.isInitialized("university") ? new QUniversity(forProperty("university")) : null;
    }

}

