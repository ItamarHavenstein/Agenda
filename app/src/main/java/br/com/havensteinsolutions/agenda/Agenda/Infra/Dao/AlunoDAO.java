package br.com.havensteinsolutions.agenda.Agenda.Infra.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import br.com.havensteinsolutions.agenda.Agenda.modelo.Aluno;

@Dao
public interface AlunoDAO {
    @Insert
    void salva(Aluno aluno);

    @Query("SELECT * FROM aluno")
    List<Aluno> todos();

    @Delete
    void remove(Aluno aluno);

//falta implementar
    void altera(Aluno aluno);

    @Query("SELECT * FROM aluno WHERE telefone = telefone")
    boolean ehAluno(String telefone);
//    public AlunoDAO(Context context) {
//        super(context, "Agenda", null, 2);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String sql = "CREATE TABLE Alunos(id INTEGER PRIMARY KEY,nome TEXT NOT NULL, endereco TEXT," +
//                " telefone TEXT, site TEXT,nota REAL, caminhoFoto TEXT);";
//        db.execSQL(sql);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int i1) {
//        switch (oldVersion) {
//            case 1:
//                String sql = "ALTER TABLE Alunos ADD COLUMN caminhoFoto TEXT";
//                db.execSQL(sql);
//        }
//    }
//
//    public void inseri(Aluno aluno) {
//        SQLiteDatabase db = getWritableDatabase();
//
//        ContentValues dados = pegaDadosDoAluno(aluno);
//
//        db.insert("Alunos", null, dados);
//    }
//
//    private ContentValues pegaDadosDoAluno(Aluno aluno) {
//        ContentValues dados = new ContentValues();
//        dados.put("nome", aluno.getNome());
//        dados.put("endereco", aluno.getEndereco());
//        dados.put("telefone", aluno.getTelefone());
//        dados.put("site", aluno.getSite());
//        dados.put("nota", aluno.getNota());
//        dados.put("caminhoFoto",aluno.getCaminhoFoto());
//        return dados;
//    }
//
//    public List<Aluno> buscaAlunos() {
//        String sql = " SELECT * FROM Alunos";
//        SQLiteDatabase db = getReadableDatabase();
//        Cursor c = db.rawQuery(sql, null);
//
//        List<Aluno> alunos = new ArrayList<Aluno>();
//        while (c.moveToNext()) {
//            Aluno aluno = new Aluno();
//            aluno.setId(c.getLong(c.getColumnIndex("id")));
//            aluno.setNome(c.getString(c.getColumnIndex("nome")));
//            aluno.setEndereco(c.getString(c.getColumnIndex("endereco")));
//            aluno.setTelefone(c.getString(c.getColumnIndex("telefone")));
//            aluno.setSite(c.getString(c.getColumnIndex("site")));
//            aluno.setNota(c.getDouble(c.getColumnIndex("nota")));
//            aluno.setCaminhoFoto(c.getString(c.getColumnIndex("caminhoFoto")));
//
//            alunos.add(aluno);
//        }
//        c.close();
//        return alunos;
//    }
//
//    public void deletar(Aluno aluno) {
//        SQLiteDatabase db = getWritableDatabase();
//        String[] params = {String.valueOf(aluno.getId())};
//
//        db.delete("Alunos", "id = ?", params);
//
//    }
//
//    public void altera(Aluno aluno) {
//        SQLiteDatabase db = getWritableDatabase();
//
//        ContentValues dados = pegaDadosDoAluno(aluno);
//        String[] params = {String.valueOf(aluno.getId())};
//
//        db.update("Alunos", dados, "id = ?", params);
//    }
//
//    public boolean ehAluno(String telefone){
//        SQLiteDatabase db = getReadableDatabase();
//        Cursor t = db.rawQuery("SELECT * FROM Alunos WHERE telefone = ?",new String[]{telefone});
//        int resultado = t.getCount();
//        t.close();
//        return resultado > 0;
//    }
}