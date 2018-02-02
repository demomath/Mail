package com.email.bkjkmail.db;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.email.bkjkmail.bean.MailInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MAIL_INFO".
*/
public class MailInfoDao extends AbstractDao<MailInfo, Long> {

    public static final String TABLENAME = "MAIL_INFO";

    /**
     * Properties of entity MailInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AccountId = new Property(1, long.class, "accountId", false, "ACCOUNT_ID");
        public final static Property Subject = new Property(2, String.class, "subject", false, "SUBJECT");
        public final static Property Time = new Property(3, String.class, "time", false, "TIME");
        public final static Property From = new Property(4, String.class, "from", false, "FROM");
        public final static Property To = new Property(5, String.class, "to", false, "TO");
        public final static Property Cc = new Property(6, String.class, "cc", false, "CC");
        public final static Property Bcc = new Property(7, String.class, "bcc", false, "BCC");
        public final static Property BodyText = new Property(8, String.class, "bodyText", false, "BODY_TEXT");
        public final static Property AttachPath = new Property(9, String.class, "attachPath", false, "ATTACH_PATH");
    }

    private Query<MailInfo> mailAccount_MailInfosQuery;

    public MailInfoDao(DaoConfig config) {
        super(config);
    }
    
    public MailInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MAIL_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"ACCOUNT_ID\" INTEGER NOT NULL ," + // 1: accountId
                "\"SUBJECT\" TEXT," + // 2: subject
                "\"TIME\" TEXT," + // 3: time
                "\"FROM\" TEXT," + // 4: from
                "\"TO\" TEXT," + // 5: to
                "\"CC\" TEXT," + // 6: cc
                "\"BCC\" TEXT," + // 7: bcc
                "\"BODY_TEXT\" TEXT," + // 8: bodyText
                "\"ATTACH_PATH\" TEXT);"); // 9: attachPath
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_ACCOUNT_ID ON \"MAIL_INFO\"" +
                " (\"ACCOUNT_ID\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_SUBJECT ON \"MAIL_INFO\"" +
                " (\"SUBJECT\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_TIME ON \"MAIL_INFO\"" +
                " (\"TIME\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_FROM ON \"MAIL_INFO\"" +
                " (\"FROM\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_TO ON \"MAIL_INFO\"" +
                " (\"TO\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_CC ON \"MAIL_INFO\"" +
                " (\"CC\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_BCC ON \"MAIL_INFO\"" +
                " (\"BCC\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_BODY_TEXT ON \"MAIL_INFO\"" +
                " (\"BODY_TEXT\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIL_INFO_ATTACH_PATH ON \"MAIL_INFO\"" +
                " (\"ATTACH_PATH\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MAIL_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MailInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAccountId());
 
        String subject = entity.getSubject();
        if (subject != null) {
            stmt.bindString(3, subject);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(4, time);
        }
 
        String from = entity.getFrom();
        if (from != null) {
            stmt.bindString(5, from);
        }
 
        String to = entity.getTo();
        if (to != null) {
            stmt.bindString(6, to);
        }
 
        String cc = entity.getCc();
        if (cc != null) {
            stmt.bindString(7, cc);
        }
 
        String bcc = entity.getBcc();
        if (bcc != null) {
            stmt.bindString(8, bcc);
        }
 
        String bodyText = entity.getBodyText();
        if (bodyText != null) {
            stmt.bindString(9, bodyText);
        }
 
        String attachPath = entity.getAttachPath();
        if (attachPath != null) {
            stmt.bindString(10, attachPath);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MailInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAccountId());
 
        String subject = entity.getSubject();
        if (subject != null) {
            stmt.bindString(3, subject);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(4, time);
        }
 
        String from = entity.getFrom();
        if (from != null) {
            stmt.bindString(5, from);
        }
 
        String to = entity.getTo();
        if (to != null) {
            stmt.bindString(6, to);
        }
 
        String cc = entity.getCc();
        if (cc != null) {
            stmt.bindString(7, cc);
        }
 
        String bcc = entity.getBcc();
        if (bcc != null) {
            stmt.bindString(8, bcc);
        }
 
        String bodyText = entity.getBodyText();
        if (bodyText != null) {
            stmt.bindString(9, bodyText);
        }
 
        String attachPath = entity.getAttachPath();
        if (attachPath != null) {
            stmt.bindString(10, attachPath);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MailInfo readEntity(Cursor cursor, int offset) {
        MailInfo entity = new MailInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1), // accountId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // subject
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // time
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // from
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // to
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cc
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // bcc
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // bodyText
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // attachPath
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MailInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAccountId(cursor.getLong(offset + 1));
        entity.setSubject(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFrom(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTo(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCc(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBcc(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setBodyText(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAttachPath(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MailInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MailInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MailInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "mailInfos" to-many relationship of MailAccount. */
    public List<MailInfo> _queryMailAccount_MailInfos(long accountId) {
        synchronized (this) {
            if (mailAccount_MailInfosQuery == null) {
                QueryBuilder<MailInfo> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AccountId.eq(null));
                queryBuilder.orderRaw("T.'TIME' ASC");
                mailAccount_MailInfosQuery = queryBuilder.build();
            }
        }
        Query<MailInfo> query = mailAccount_MailInfosQuery.forCurrentThread();
        query.setParameter(0, accountId);
        return query.list();
    }

}