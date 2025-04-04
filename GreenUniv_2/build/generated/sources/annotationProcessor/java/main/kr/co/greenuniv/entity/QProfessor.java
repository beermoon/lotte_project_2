package kr.co.greenuniv.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfessor is a Querydsl query type for Professor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfessor extends EntityPathBase<Professor> {

    private static final long serialVersionUID = -1446084924L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfessor professor = new QProfessor("professor");

    public final QDepartment department;

    public final StringPath P_addr1 = createString("P_addr1");

    public final StringPath P_addr2 = createString("P_addr2");

    public final StringPath P_appointdate = createString("P_appointdate");

    public final StringPath P_degree = createString("P_degree");

    public final StringPath P_email = createString("P_email");

    public final StringPath P_Ename = createString("P_Ename");

    public final StringPath P_gender = createString("P_gender");

    public final StringPath P_graddate = createString("P_graddate");

    public final StringPath P_graduniv = createString("P_graduniv");

    public final StringPath P_hp = createString("P_hp");

    public final StringPath P_name = createString("P_name");

    public final StringPath P_nation = createString("P_nation");

    public final StringPath P_num = createString("P_num");

    public final StringPath P_Pnum = createString("P_Pnum");

    public final StringPath P_spec = createString("P_spec");

    public final StringPath P_zip = createString("P_zip");

    public final QUniversity university;

    public QProfessor(String variable) {
        this(Professor.class, forVariable(variable), INITS);
    }

    public QProfessor(Path<? extends Professor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfessor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfessor(PathMetadata metadata, PathInits inits) {
        this(Professor.class, metadata, inits);
    }

    public QProfessor(Class<? extends Professor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department"), inits.get("department")) : null;
        this.university = inits.isInitialized("university") ? new QUniversity(forProperty("university")) : null;
    }

}

