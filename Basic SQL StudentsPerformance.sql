CREATE DATABASE students;

-- 1. Bagaimana query untuk mendapatkan seluruh data dari tabel?
SELECT * FROM StudentsPerformance;

-- 2. Ada grup race/ethnicity apa saja pada dataset tersebut?
SELECT DISTINCT race_or_ethnicity FROM StudentsPerformance;

-- 3. Orang dengan grup apa yang memiliki nilai math sama dengan 0?
SELECT * FROM StudentsPerformance WHERE math_score = 0;

-- 4. Berapa nilai writing terkecil orang yang memiliki orangtua dengan tingkat pendidikan associate's degree?
SELECT * FROM StudentsPerformance WHERE parental_level_of_education = "associate's degree" ORDER BY writing_score ASC;

-- 5. Jika nilai writing terendah orang di grup A dijumlahkan dengan nilai writing terendah orang di grup B, maka hasilnya adalah...
SELECT * FROM StudentsPerformance WHERE race_or_ethnicity IN ("group A", "group B") ORDER BY writing_score ASC;

-- 6. Berapa orang yang memiliki nilai math kurang dari 65 namun memiliki nilai writing lebih besar dari 80?
SELECT * FROM StudentsPerformance WHERE writing_score > 80 AND math_score < 65 ORDER BY writing_score ASC;

-- 7. Jika data di-filter dengan nilai reading lebih dari 10 namun kurang dari 25, tingkat pendidikan orangtua apa saja yang termasuk ke dalam data tersebut?
SELECT * FROM StudentsPerformance WHERE reading_score > 10 AND reading_score < 25 ORDER BY reading_score;

-- 8. Query A
SELECT * FROM StudentsPerformance WHERE parental_level_of_education LIKE '%high%' AND race_or_ethnicity NOT IN ('group A', 'group B')
AND reading_score < 35;

-- 9. Query B
SELECT * FROM StudentsPerformance WHERE parental_level_of_education LIKE 'high%' AND race_or_ethnicity NOT IN ('group A', 'group B')
AND reading_score < 35;