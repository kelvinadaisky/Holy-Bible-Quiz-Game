package com.example.holybiblequiz
import kotlin.collections.ArrayList

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {
            val questionsList = ArrayList<Question>()

            val que1 = Question(
                1, "In what city was Jesus Christ born",
                "Nazareth", "Jerusalem",
                "Bethlehem", "Jericho",
                3
            )
            questionsList.add(que1)

            val que2 = Question(
                2, "What is the name of Jesus Christ's mother?",
                "Mary", "Martha",
                "Sarah", "Rebecca",
                1
            )
            questionsList.add(que2)

            val que3 = Question(
                3, "How many disciples did Jesus have?",
                "10", "8",
                "15", "12",
                4
            )
            questionsList.add(que3)

            val que4 = Question(
                4, "On what day did Jesus rise from the dead",
                "Easter Sunday", "Christmas Day",
                "New Year", "Good Friday",
                1
            )
            questionsList.add(que4)

            val que5 = Question(
                5, "Who was known as the 'Father of Faith'?",
                "Moses", "David",
                "Abraham", "Isaac",
                3
            )
            questionsList.add(que5)
 // Question 6
            val que6 = Question(
                6, "What is the first book of the Bible?",
                "Genesis", "Exodus",
                "Leviticus", "Numbers",
                1
            )
            questionsList.add(que6)


// Question 7
        val que7 = Question(
            7, "What was the name of the river where John the Baptist baptized people?",
            "Jordan River", "Nile River",
            "Euphrates River", "Tigris River",
            1
        )
        questionsList.add(que7)

// Question 8
        val que8 = Question(
            8, "Who betrayed Jesus to the religious authorities for thirty pieces of silver?",
            "Peter", "Matthew",
            "Judas Iscariot", "Simon",
            3
        )
        questionsList.add(que8)

// Question 9
        val que9 = Question(
            9, "Which biblical figure is known for building an ark to survive a great flood?",
            "Abraham", "David",
            "Moses", "Noah",
            4
        )
        questionsList.add(que9)

// Question 10
        val que10 = Question(
            10, "What is the first commandment given in the Ten Commandments?",
            "You shall not murder", "You shall not steal",
            "You shall have no other gods before me", "You shall not covet",
            3
        )
        questionsList.add(que10)

// Continue adding more questions...

// Question 11
        val que11 = Question(
            11, "Who wrote the majority of the New Testament?",
            "David", "Moses",
            "Paul", "John",
            3
        )
        questionsList.add(que11)

// Question 12
        val que12 = Question(
            12, "What is the last book of the Bible?",
            "Genesis", "Exodus",
            "Revelation", "Matthew",
            3
        )
        questionsList.add(que12)

// Question 13
        val que13 = Question(
            13, "What is the shortest verse in the Bible?",
            "John 3:16", "Genesis 1:1",
            "Revelation 22:21", "John 11:35",
            4
        )
        questionsList.add(que13)

// Question 14
        val que14 = Question(
            14, "Who was the first king of Israel?",
            "Saul", "David",
            "Solomon", "Abraham",
            1
        )
        questionsList.add(que14)

// Question 15
        val que15 = Question(
            15, "What is the name of the hill where Jesus was crucified?",
            "Mount Zion", "Mount Nebo",
            "Mount of Olives", "Golgotha",
            4
        )
        questionsList.add(que15)



// Question 16
        val que16 = Question(
            16, "Which biblical figure survived being thrown into a den of lions?",
            "Jonah", "Daniel",
            "Isaiah", "Ezekiel",
            2
        )
        questionsList.add(que16)

// Question 17
        val que17 = Question(
            17, "Who led the Israelites out of slavery in Egypt?",
            "Joseph", "Aaron",
            "Moses", "Elijah",
            3
        )
        questionsList.add(que17)

// Question 18
        val que18 = Question(
            18, "What is the longest book in the New Testament?",
            "Romans", "Ephesians",
            "1 Corinthians", "Matthew",
            1
        )
        questionsList.add(que18)

// Question 19
        val que19 = Question(
            19, "Who wrote the Psalms in the Bible?",
            "David", "Solomon",
            "Elijah", "Isaiah",
            1
        )
        questionsList.add(que19)

// Question 20
        val que20 = Question(
            20, "What is the first miracle performed by Jesus according to the Bible?",
            "Turning water into wine", "Feeding the 5,000",
            "Healing the blind", "Walking on water",
            1
        )
        questionsList.add(que20)

// Question 21
        val que21 = Question(
            21, "Who was the first man created by God according to the Bible?",
            "Abel", "Noah",
            "Adam", "Cain",
            3
        )
        questionsList.add(que21)

// Question 22
        val que22 = Question(
            22, "Which prophet was known for being swallowed by a great fish?",
            "Elijah", "Isaiah",
            "Jonah", "Jeremiah",
            3
        )
        questionsList.add(que22)

// Question 23
        val que23 = Question(
            23, "What is the fifth book of the Bible?",
            "Genesis", "Exodus",
            "Leviticus", "Deuteronomy",
            4
        )
        questionsList.add(que23)

// Question 24
        val que24 = Question(
            24, "What is the name of the garden where Adam and Eve lived according to the Bible?",
            "Garden of Eden", "Garden of Gethsemane",
            "Garden of Olives", "Garden of Delight",
            1
        )
        questionsList.add(que24)

// Question 25
        val que25 = Question(
            25, "Who wrote the Book of Revelation in the Bible?",
            "Paul", "John",
            "Matthew", "Mark",
            2
        )
        questionsList.add(que25)

// Question 26
        val que26 = Question(
            26, "What is the seventh day of the week according to the Bible?",
            "Friday", "Saturday",
            "Sunday", "Monday",
            2
        )
        questionsList.add(que26)

// Question 27
        val que27 = Question(
            27, "Who is known for being the wisest king in the Bible?",
            "Saul", "David",
            "Solomon", "Abraham",
            3
        )
        questionsList.add(que27)

// Question 28
        val que28 = Question(
            28, "What is the last word of Jesus on the cross according to the Bible?",
            "It is finished", "My God, my God, why have you forsaken me?",
            "Father, into your hands I commit my spirit", "Eli, Eli, lema sabachthani?",
            1
        )
        questionsList.add(que28)

// Question 29
        val que29 = Question(
            29, "Who was the first high priest of Israel according to the Bible?",
            "Aaron", "Eli",
            "Moses", "Samuel",
            1
        )
        questionsList.add(que29)

// Question 30
        val que30 = Question(
            30, "What is the name of the river where Jesus was baptized by John the Baptist?",
            "Nile River", "Jordan River",
            "Euphrates River", "Tigris River",
            2
        )
        questionsList.add(que30)

// Question 31
        val que31 = Question(
            31, "Which prophet saw a vision of a valley of dry bones coming to life?",
            "Ezekiel", "Isaiah",
            "Jeremiah", "Daniel",
            1
        )
        questionsList.add(que31)

// Question 32
        val que32 = Question(
            32, "What is the shortest book in the New Testament?",
            "2 Timothy", "Titus",
            "Philemon", "3 John",
            3
        )
        questionsList.add(que32)

// Question 33
        val que33 = Question(
            33, "Who was known for his great strength and long hair in the Bible?",
            "Gideon", "Ehud",
            "Samson", "Jephthah",
            3
        )
        questionsList.add(que33)

// Question 34
        val que34 = Question(
            34, "What is the name of the mountain where Moses received the Ten Commandments?",
            "Mount Sinai", "Mount Zion",
            "Mount Nebo", "Mount Horeb",
            1
        )
        questionsList.add(que34)

// Question 35
        val que35 = Question(
            35, "Who was the first martyr of the Christian church according to the Bible?",
            "Peter", "Stephen",
            "Paul", "James",
            2
        )
        questionsList.add(que35)

// Continue adding more questions...

// Question 36
        val que36 = Question(
            36, "What is the name of the river where Jesus was baptized by John the Baptist?",
            "Nile River", "Jordan River",
            "Euphrates River", "Tigris River",
            2
        )
        questionsList.add(que36)

// Question 37
        val que37 = Question(
            37, "Who was the prophet known for his message of repentance and preparing the way for the Lord?",
            "Elijah", "Elisha",
            "Amos", "John the Baptist",
            4
        )
        questionsList.add(que37)

// Question 38
        val que38 = Question(
            38, "Which apostle is known as the 'doubting Thomas'?",
            "John", "Peter",
            "Matthew", "Thomas",
            4
        )
        questionsList.add(que38)

// Question 39
        val que39 = Question(
            39, "What was the name of the giant defeated by David with a sling and a stone?",
            "Goliath", "Og",
            "Anak", "Sihon",
            1
        )
        questionsList.add(que39)

// Question 40
        val que40 = Question(
            40, "What is the name of the sea that Moses parted to escape from Egypt?",
            "Red Sea", "Dead Sea",
            "Mediterranean Sea", "Black Sea",
            1
        )
        questionsList.add(que40)


// Question 41
        val que41 = Question(
            41, "Who was the first king of Israel?",
            "Saul", "David",
            "Solomon", "Abraham",
            1
        )
        questionsList.add(que41)

// Question 42
        val que42 = Question(
            42, "Who is known for being a skilled harpist and writer of many Psalms in the Bible?",
            "David", "Solomon",
            "Moses", "Abraham",
            1
        )
        questionsList.add(que42)

// Question 43
        val que43 = Question(
            43, "Who was the brother of Moses and the spokesperson to Pharaoh?",
            "Aaron", "Elijah",
            "Elisha", "Ezra",
            1
        )
        questionsList.add(que43)

// Question 44
        val que44 = Question(
            44, "What is the name of the angel who announced the birth of Jesus to Mary?",
            "Michael", "Gabriel",
            "Raphael", "Uriel",
            2
        )
        questionsList.add(que44)

// Question 45
        val que45 = Question(
            45, "What is the first miracle of Jesus recorded in the Gospel of John?",
            "Turning water into wine", "Feeding the 5,000",
            "Healing the blind", "Walking on water",
            1
        )
        questionsList.add(que45)



// Question 46
        val que46 = Question(
            46, "Who was known for interpreting Pharaoh's dream about seven years of plenty and seven years of famine?",
            "Daniel", "Joseph",
            "Jeremiah", "Isaiah",
            2
        )
        questionsList.add(que46)

// Question 47
        val que47 = Question(
            47, "What is the name of the garden where Jesus prayed before his crucifixion?",
            "Garden of Gethsemane", "Garden of Olives",
            "Garden of Eden", "Garden of Delight",
            1
        )
        questionsList.add(que47)

// Question 48
        val que48 = Question(
            48, "Who was known for being a shepherd before becoming the king of Israel?",
            "Saul", "Solomon",
            "David", "Abraham",
            3
        )
        questionsList.add(que48)

// Question 49
        val que49 = Question(
            49, "What is the name of the tax collector who became one of Jesus' disciples?",
            "Matthew", "Mark",
            "Luke", "John",
            1
        )
        questionsList.add(que49)

// Question 50
        val que50 = Question(
            50, "What is the name of the river where Naaman was instructed to dip seven times to be healed?",
            "Nile River", "Jordan River",
            "Euphrates River", "Tigris River",
            2
        )
        questionsList.add(que50)

// Question 51
        val que51 = Question(
            51, "What is the significance of the name 'Jesus'?",
            "The Messiah", "The Savior",
            "The Anointed One", "All of the above",
            4
        )
        questionsList.add(que51)

// Question 52
        val que52 = Question(
            52, "Which event is commemorated on Good Friday?",
            "The birth of Jesus", "The Last Supper",
            "The crucifixion of Jesus", "The resurrection of Jesus",
            3
        )
        questionsList.add(que52)

// Question 53
        val que53 = Question(
            53, "What is the term for the period of fasting and prayer before Easter?",
            "Lent", "Advent",
            "Pentecost", "Epiphany",
            1
        )
        questionsList.add(que53)

// Question 54
        val que54 = Question(
            54, "How many times did Peter deny knowing Jesus before the rooster crowed?",
            "Two times", "Three times",
            "Four times", "Five times",
            2
        )
        questionsList.add(que54)

// Question 55
        val que55 = Question(
            55, "What did Jesus use to feed the multitude in the miracle of the loaves and fishes?",
            "Bread and wine", "Fish and chips",
            "Five loaves and two fish", "Manna from heaven",
            3
        )
        questionsList.add(que55)


// Question 56
        val que56 = Question(
            56, "How many days and nights was Jesus in the wilderness during his temptation?",
            "7 days and 7 nights", "40 days and 40 nights",
            "12 days and 12 nights", "3 days and 3 nights",
            2
        )
        questionsList.add(que56)

// Question 57
        val que57 = Question(
            57, "What was the first miracle performed by Jesus, as recorded in the Bible?",
            "Turning water into wine", "Feeding the 5,000",
            "Healing the blind", "Walking on water",
            1
        )
        questionsList.add(que57)

// Question 58
        val que58 = Question(
            58, "What is the name of the disciple who betrayed Jesus to the religious authorities?",
            "Peter", "Matthew",
            "Judas Iscariot", "Simon",
            3
        )
        questionsList.add(que58)

// Question 59
        val que59 = Question(
            59, "Where was Jesus when he delivered the Sermon on the Mount?",
            "Jerusalem", "Nazareth",
            "Bethlehem", "Galilee",
            4
        )
        questionsList.add(que59)

// Question 60
        val que60 = Question(
            60, "What was the profession of Joseph, the earthly father of Jesus?",
            "Fisherman", "Carpenter",
            "Shepherd", "Priest",
            2
        )
        questionsList.add(que60)

// Question 61
        val que61 = Question(
            61, "Who is known for building the Ark according to God's instructions before a great flood?",
            "Abraham", "Moses",
            "Noah", "Isaiah",
            3
        )
        questionsList.add(que61)

// Question 62
        val que62 = Question(
            62, "What is the name of the mountain where Moses received the Ten Commandments?",
            "Mount Horeb", "Mount Zion",
            "Mount Moriah", "Mount Sinai",
            4
        )
        questionsList.add(que62)

// Question 63
        val que63 = Question(
            63, "Who is considered the 'Father of Faith' in the Bible?",
            "Abraham", "David",
            "Moses", "Isaiah",
            1
        )
        questionsList.add(que63)

// Question 64
        val que64 = Question(
            64, "What is the name of the man who wrestled with God and received the name 'Israel'?",
            "Jacob", "Esau",
            "David", "Solomon",
            1
        )
        questionsList.add(que64)

// Question 65
        val que65 = Question(
            65, "Which prophet was known for being swallowed by a great fish?",
            "Ezekiel", "Isaiah",
            "Jonah", "Jeremiah",
            3
        )
        questionsList.add(que65)


// Question 66
        val que66 = Question(
            66, "What is the name of the river that Naaman was instructed to dip in to be healed of his leprosy?",
            "Nile River", "Euphrates River",
            "Jordan River", "Tigris River",
            3
        )
        questionsList.add(que66)

// Question 67
        val que67 = Question(
            67, "Which biblical figure was known for interpreting dreams in Egypt and became a high official?",
            "Joseph", "Elijah",
            "Elisha", "Isaiah",
            1
        )
        questionsList.add(que67)

// Question 68
        val que68 = Question(
            68, "What is the name of the mountain where Elijah confronted the prophets of Baal?",
            "Mount Sinai", "Mount Tabor",
            "Mount Carmel", "Mount Nebo",
            3
        )
        questionsList.add(que68)

// Question 69
        val que69 = Question(
            69, "Who led the Israelites out of slavery in Egypt?",
            "Joseph", "Aaron",
            "Moses", "Joshua",
            3
        )
        questionsList.add(que69)

// Question 70
        val que70 = Question(
            70, "What is the name of the festival commemorating the Israelites' escape from Egypt?",
            "Passover", "Sukkot",
            "Purim", "Hanukkah",
            1
        )
        questionsList.add(que70)

// Question 71
        val que71 = Question(
            71, "What is the first miracle performed by Jesus according to the Bible?",
            "Turning water into wine", "Feeding the 5,000",
            "Healing the blind", "Walking on water",
            1
        )
        questionsList.add(que71)

// Question 72
        val que72 = Question(
            72, "Who was known as the 'doubting Thomas' among the disciples?",
            "John", "Peter",
            "Matthew", "Thomas",
            4
        )
        questionsList.add(que72)

// Question 73
        val que73 = Question(
            73, "What is the name of the mountain where Jesus delivered the Sermon on the Mount?",
            "Mount Moriah", "Mount Tabor",
            "Mount Carmel", "Mount of Beatitudes",
            4
        )
        questionsList.add(que73)

// Question 74
        val que74 = Question(
            74, "What is the last word of Jesus on the cross according to the Bible?",
            "It is finished", "My God, my God, why have you forsaken me?",
            "Father, into your hands I commit my spirit", "Eli, Eli, lema sabachthani?",
            1
        )
        questionsList.add(que74)

// Question 75
        val que75 = Question(
            75, "Who was the first martyr of the Christian church according to the Bible?",
            "Peter", "Stephen",
            "Paul", "James",
            2
        )
        questionsList.add(que75)

// Question 76
        val que76 = Question(
            76, "What is the significance of the name 'Jesus'?",
            "The Messiah", "The Savior",
            "The Anointed One", "All of the above",
            4
        )
        questionsList.add(que76)

// Question 77
        val que77 = Question(
            77, "Which event is commemorated on Good Friday?",
            "The birth of Jesus", "The Last Supper",
            "The crucifixion of Jesus", "The resurrection of Jesus",
            3
        )
        questionsList.add(que77)

// Question 78
        val que78 = Question(
            78, "What is the term for the period of fasting and prayer before Easter?",
            "Lent", "Advent",
            "Pentecost", "Epiphany",
            1
        )
        questionsList.add(que78)

// Question 79
        val que79 = Question(
            79, "What did Jesus use to feed the multitude in the miracle of the loaves and fishes?",
            "Bread and wine", "Fish and chips",
            "Five loaves and two fish", "Manna from heaven",
            3
        )
        questionsList.add(que79)

// Question 80
        val que80 = Question(
            80, "How many days and nights was Jesus in the wilderness during his temptation?",
            "7 days and 7 nights", "40 days and 40 nights",
            "12 days and 12 nights", "3 days and 3 nights",
            2
        )
        questionsList.add(que80)

// Question 81
        val que81 = Question(
            81, "What is another name for the Holy Spirit?",
            "Comforter", "Advocate",
            "Counselor", "All of the above",
            4
        )
        questionsList.add(que81)

// Question 82
        val que82 = Question(
            82, "What event in the New Testament is often associated with the descent of the Holy Spirit?",
            "The Baptism of Jesus", "The Last Supper",
            "Pentecost", "The Transfiguration",
            3
        )
        questionsList.add(que82)

// Question 83
        val que83 = Question(
            83, "In the Bible, the Holy Spirit is symbolized by which of the following?",
            "A dove", "A lion",
            "A lamb", "A serpent",
            1
        )
        questionsList.add(que83)

// Question 84
        val que84 = Question(
            84, "What did Jesus promise to send to his disciples after his departure?",
            "Angels", "The Holy Spirit",
            "Fire", "Manna",
            2
        )
        questionsList.add(que84)

// Question 85
        val que85 = Question(
            85, "The Holy Spirit is often referred to as the third person of the...",
            "Trinity", "Disciples",
            "Prophets", "Apostles",
            1
        )
        questionsList.add(que85)

// Question 86
        val que86 = Question(
            86, "What role does the Holy Spirit play in the lives of believers according to the New Testament?",
            "Conviction of sin", "Guidance and comfort",
            "Empowerment for service", "All of the above",
            4
        )
        questionsList.add(que86)

// Question 87
        val que87 = Question(
            87, "On what day did the disciples receive the Holy Spirit in the form of tongues of fire?",
            "Good Friday", "Easter Sunday",
            "Pentecost", "Ascension Day",
            3
        )
        questionsList.add(que87)

// Question 88
        val que88 = Question(
            88, "Which book in the New Testament contains teachings about the Holy Spirit and spiritual gifts?",
            "Acts", "Revelation",
            "1 Corinthians", "Galatians",
            3
        )
        questionsList.add(que88)

// Question 89
        val que89 = Question(
            89, "What is the primary role of the Holy Spirit, according to the New Testament?",
            "To heal physical illnesses", "To give wealth and prosperity",
            "To sanctify and empower believers", "To reveal future events",
            3
        )
        questionsList.add(que89)

// Question 90
        val que90 = Question(
            90, "Which of the following is a fruit of the Holy Spirit mentioned in the New Testament?",
            "Gold", "Love",
            "Happiness", "Knowledge",
            2
        )
        questionsList.add(que90)


// Question 91
        val que91 = Question(
            91, "How is God often described in the Bible?",
            "Omnipotent", "Omniscient",
            "Omnipresent", "All of the above",
            4
        )
        questionsList.add(que91)

// Question 92
        val que92 = Question(
            92, "What is the first commandment given by God in the Ten Commandments?",
            "You shall not murder", "You shall not steal",
            "You shall have no other gods before me", "You shall not commit adultery",
            3
        )
        questionsList.add(que92)

// Question 93
        val que93 = Question(
            93, "In the Christian doctrine, how many persons are there in the one God?",
            "One person", "Two persons",
            "Three persons", "Four persons",
            3
        )
        questionsList.add(que93)

// Question 94
        val que94 = Question(
            94, "What is the central teaching about God in Christianity?",
            "Monotheism", "Polytheism",
            "Trinity", "Dualism",
            3
        )
        questionsList.add(que94)

// Question 95
        val que95 = Question(
            95, "According to the Bible, what is God's attribute of being present everywhere?",
            "Omnipotence", "Omniscience",
            "Omnipresence", "Omnibenevolence",
            3
        )
        questionsList.add(que95)


// Question 96
        val que96 = Question(
            96, "In which book of the Bible can the Ten Commandments be found?",
            "Genesis", "Exodus",
            "Leviticus", "Deuteronomy",
            2
        )
        questionsList.add(que96)

// Question 97
        val que97 = Question(
            97, "What is the primary message of Jesus regarding God's nature?",
            "God is vengeful", "God is distant",
            "God is love", "God is hidden",
            3
        )
        questionsList.add(que97)

// Question 98
        val que98 = Question(
            98, "What is the Christian doctrine that teaches God's three-in-one nature?",
            "Monotheism", "Polytheism",
            "Atheism", "Trinity",
            4
        )
        questionsList.add(que98)

// Question 99
        val que99 = Question(
            99, "What is the name used to address God in the Lord's Prayer?",
            "Father", "King",
            "Master", "Lord",
            1
        )
        questionsList.add(que99)

// Question 100
        val que100 = Question(
            100, "What is the term for the belief in one God?",
            "Monotheism", "Polytheism",
            "Atheism", "Pantheism",
            1
        )
        questionsList.add(que100)

        questionsList.shuffle()

        return questionsList

    }

}