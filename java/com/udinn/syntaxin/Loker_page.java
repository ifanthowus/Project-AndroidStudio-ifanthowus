package com.udinn.syntaxin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Loker_page extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ItemClass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loker_page);


        //--> Creating a list
        list = new ArrayList<>();
        list.add(new ItemClass(R.drawable.google, "Google Company", "Google Inc. adalah perusahaan multinasional Amerika Serikat yang bergerak di bidang layanan dan produk internet seperti mesin pencari, komputasi web, perangkat lunak, dan periklanan daring. Perusahaan ini didirikan oleh alumni Stanford University yaitu Larry Page dan Sergey Brin. Pada tahun 1996, mereka membangun sebuah mesin pencari (awalnya bernama BackRub) yang menggunakan link untuk menentukan pentingnya halaman web individu. Larry dan Sergey hanya 16% dari saham perusahaan, maka pada tanggal 4 September 1998, mereka membuat Google Inc. sebagai perusahaan swasta. Namun pada tanggal 19 Agustus 2004, perusahaan kemudian berubah menjadi perusahaan publik dengan sahamnya terdaftar di NASDAQ. Kini, markas Google berada di 1600 Amphitheatre Parkway, Mountain View, CA 94043.\n" +
                "\n" +
                "Proyek Google dimulai pada bulan Januari 1996 sebagai sebuah proyek penelitian oleh Larry Page dan Sergey Brin ketika mereka berdua masih menjadi mahasiswa PhD di Stanford University di Stanford, California. Mesin pencari konvensional umumnya menghitung berapa kali istilah pencarian suatu web muncul pada halaman, namun kedua penemu Google ini menemukan teori lain yang lebih baik untuk menganalisis website. Mereka menganalisis hubungan antar wesbsites yang kemudian disebut dengan teknologi PageRank. Teknologi ini menentukan relevansi sebuah website oleh jumlah halaman, dan pentingnya halaman tersebut, yang menghubungkan kembali ke situs asli.\n" +
                "\n" +
                "Larry dan Sergey awalnya menjuluki mesin pencari mereka dengan nama 'BackRub' karena sistemnya yang mengecek banklink untuk memperkirakan pentingnya sebuah situs. Kemudian mereka berganti nama menjadi Google yang sebenarnya berasal dari ejaan  kata \"googol\". Sebagai sebuah proyek akademis, Google awalnya dijalankan oleh website Stanford University'dengan domain google.stanford.edu dan z.stanford.edu.\n" +
                "Google kemudian diregistrasikan sebagai sebuah perusahaan pada tanggal 15 September 1997 meskipun berdirinya pada tanggal 4 September 1998. Perusahaan ini menjadikan garasi Susan Wojcicki, teman Larry dan Sergey, yang terletak di Menlo Park, California sebagai markas mereka. Craig Silverstein, sesama mahasiswa PhD di Stanford dipekerjakan sebagai karyawan pertama Google.\n" +
                "\n" +
                "Pada Mei 2011, jumlah pengunjung bulanan ke Google melampaui satu miliar untuk pertama kalinya, meningkat 8,4 persen dari Mei 2010 (931.000.000). Pada Januari 2013, Google mengumumkan telah memperoleh $ 50 miliar dalam pendapatan tahunan di tahun 2012.\n" +
                "Penawaran umum perdana Google (IPO) terjadi pada tanggal 19 Agustus 2004. Pada saat itu Larry Page, Sergey Brin, dan Eric Schmidt setuju untuk bekerja sama di Google selama 20 tahun, sampai tahun 2024. Perusahaan ini menawarkan 19.605.052 saham dengan harga $ 85 per saham. Saham dijual dalam format lelang online yang unik menggunakan sistem yang dibangun oleh Morgan Stanley dan Credit Suisse sebagai penjamin kesepakatan emisi. Mayoritas saham Google masih dalam kendali perusahaan sehingga banyak banyak karyawan Google menjadi milyuner mendadak. Salah satu kompetetitor Google, Yahoo, yang memiliki saham 8,4 juta lembar saham Google sebelum IPO terjadi juga mendapat banyak keuntungan.\n" +
                "\n" +
                "Dengan tingginya nilai jual saham Google, banyak orang mengisukan perubahan company culture dan filosofi anti-corporate dan no evil-nya. Meskipun Larry dan Sergey berjanji bahwa pada laporan untuk investor potensialnya IPO tidak akan merubah apa pun, namun berbagai artikel seperti The New York Times mulai menyoroti perubahan itu. Maka, untuk mencegah perubahan budaya dalam perusahaan, Google secara khusus membuat Chief Culture Officer yang bertugas yang melakukan tugas HRD Google. Chief Culture Officer dimaksudkan untuk mengembangkan dan mempertahankan budaya dan pekerjaan tetap pada jalan yang benar menuju nilai-nilai inti perusahaan."));
        list.add(new ItemClass(R.drawable.apple, "Apple.inc", "Apple Inc. adalah perusahaan teknologi multinasional yang berpusat di Cupertino, California, yang merancang, mengembangkan, dan menjual barang elektronik konsumen, perangkat lunak komputer, dan layanan daring. Perangkat keras yang diproduksi Apple meliputi telepon pintar iPhone, komputer tablet iPad, komputer pribadi Mac, pemutar media portabel iPod, jam pintar Apple Watch, pemutar media digital Apple TV, dan pengeras suara pintar HomePod. Perangkat lunak yang diproduksi Apple meliputi sistem operasi macOS dan iOS, pemutar media iTunes, penjelajah web Safari, dan perangkat kreativitas dan produktivitas iLife dan iWork, serta berbagai aplikasi profesional seperti Final Cut Pro, Logic Pro, dan Xcode. Layanan daringnya meliputi iTunes Store, iOS App Store dan Mac App Store, Apple Music, dan iCloud.\n" +
                "\n" +
                "Apple didirikan oleh Steve Jobs, Steve Wozniak, dan Ronald Wayne pada April 1976 untuk mengembangkan dan menjual komputer pribadi Apple I buatan Wozniak. Perusahaan ini resmi berdiri dengan nama Apple Computer, Inc. pada Januari 1977. Penjualan komputer-komputernya, termasuk Apple II, menandai pertumbuhan perusahaan ini. Dalam kurun beberapa tahun, Jobs dan Wozniak mempekerjakan banyak perancang komputer dan memiliki lini produksi. Apple menjadi perusahaan terbuka pada tahun 1980 dan meraup laba yang sangat besar. Selama beberapa tahun berikutnya, Apple memproduksi komputer-komputer baru yang memiliki antarmuka pengguna grafis inovatif seperti Macintosh pertama tahun 1984. Iklan produk Apple mendapat banyak pujian. Namun, harga produknya yang mahal dan perangkat lunak yang sedikit menjadi sumber perpecahan antara petinggi perusahaan. Pada tahun 1985, Wozniak keluar dari Apple dan Jobs mengundurkan diri. Jobs memboyong sejumlah karyawan Apple dan mendirikan perusahaan baru pada tahun berikutnya, NeXT.\n" +
                "\n" +
                "Seiring berkembangnya pasar komputer pribadi, angka penjualan komputer Apple menurun karena para pesaingnya menjual produk yang lebih murah, terutama komputer yang menggunakan sistem operasi Microsoft Windows. Perombakan petinggi Apple terus berlangsung sampai CEO Gil Amelio memutuskan pada tahun 1997 untuk membeli NeXT dan mengajak Jobs kembali ke Apple. Jobs kembali memimpin perusahaan dan diangkat menjadi CEO tidak lama kemudian. Ia mulai membangun kembali status Apple dengan membuka toko ritel pada tahun 2001, mengakuisisi sejumlah perusahaan perangkat lunak untuk membangun portofolio perangkat lunak Apple, dan mengubah sebagian perangkat keras yang dipakai oleh komputer-komputernya. Apple kembali sukses dan untung besar. Pada Januari 2007, Jobs mengumumkan bahwa Apple Computer, Inc. berganti nama menjadi Apple Inc. untuk mencerminkan peralihan fokus perusahaan ke barang elektronik konsumen. Ia juga meluncurkan iPhone, telepon pintar yang mendapat banyak pujian dan laris terjual. Pada Agustus 2011, Jobs mundur dari jabatannya sebagai CEO karena masalah kesehatan dan digantikan oleh Tim Cook. Dua bulan kemudian, Jobs meninggal dunia. Kematiannya menjadi awal era baru bagi perusahaan ini.\n" +
                "\n" +
                "Pendapatan tahunan global Apple mencapai $229 miliar pada tahun fiskal 2017. Apple merupakan perusahaan teknologi informasi terbesar di dunia menurut pendapatan dan produsen telepon genggam terbesar ketiga di dunia setelah Samsung dan Huawei.[6] Pada Agustus 2018, Apple menjadi perusahaan terbuka A.S. pertama yang nilainya di atas US$1 triliun.[7][8] Perusahaan ini mempekerjakan 123.000 karyawan purnawaktu[9] dan memiliki 504 toko ritel di 24 negara hingga 1 Parameter salah (harus 1 — 12) 2018.[10] Apple mengoperasikan iTunes Store, penjual musik terbesar di dunia. Hingga 1 Januari 2018, lebih dari 1,3 miliar produk Apple dipakai secara aktif di seluruh dunia.[11] Perusahaan ini memiliki pelanggan dengan kesetiaan merek yang sangat tinggi dan berkali-kali diberi gelar merek paling bernilai di dunia. Namun, Apple mendapat banyak kritik atas praktik tenaga kerja oleh para kontraktornya, dampak lingkungan dan praktik bisnisnya, termasuk sikap anti-persaingan, serta sumber bahan-bahan produknya."));
        list.add(new ItemClass(R.drawable.gojekicon, "Go Jek", "Gojek Inc.Gojek (ditulis bergaya sebagai goȷek, sebelumnya ditulis GO-JEK) merupakan sebuah perusahaan teknologi asal Indonesia yang melayani angkutan melalui jasa ojek. \n " +
                "Perusahaan ini didirikan pada tahun 2010 di Jakarta oleh Nadiem Makarim."));
        list.add(new ItemClass(R.drawable.danaicon, "Dana ", "Dana Inc. DANA adalah dompet digital Indonesia yang didesain untuk menjadikan setiap transaksi nontunai dan nonkartu secara digital, baik online maupun offline  dapat berjalan dengan cepat, praktis dan tetap terjamin keamanannya.\n" +
                "\n" +
                "Talenta-talenta terbaik Indonesia terus mengembangkan DANA sebagai dompet digital berplatform terbuka yang siap dimanfaatkan untuk mendukung setiap aktivitas ekonomi dan gaya hidup digital semua kalangan masyarakat Indonesia.\n" +
                "\n" +
                "Dengan DANA, masyarakat bisa menjadi lebih produktif, efisien, dan kompeten. DANA juga dapat dioptimalkan untuk mendukung komitmen pemerintah menghemat biaya produksi dan distribusi uang fisik, serta meningkatkan literasi dan inklusi keuangan masyarakat Indonesia.\n" +
                "\n" +
                "DANA adalah bukti bahwa Indonesia mampu membangun serta mengembangkan teknologi dan infrastruktur ekonomi digital yang selalu siap diandalkan."));
        list.add(new ItemClass(R.drawable.binaracademyicon, "Binar Academy", "Binar Academy. Binar Academy memiliki nilai-nilai dan tujuan yang dituangkan ke dalam visi & misi perusahaan. Kristalisasi nilai dan tujuan tersebut diharapkan dapat menjadi landasan bagi Binar Academy serta seluruh orang yang terlibat di dalamnya. Mulai dari pendiri hingga akademisi."));
        list.add(new ItemClass(R.drawable.huaweiicon, "Huawei Indonesia", "Huawei Inc.Huawei adalah perusahaan China yang memproduksi alat komunikasi dan juga peralatan jaringan. Didirikan pada tahun 1987 oleh Ren Zhengfei, perusahaan ini bermarkas di kota Guangdong China.\n" +
                "\n" +
                "Pada awalnya perusahaan yang didirikan oleh mantan pasukan militer ini didirikan sebagai perusahaan eksklusif. Misi utama dari perusahaan ini adalah membangun dan mengembangkan jaringan komunikasi dalam perusahaan lokal dan interlokal China dengan tujuan memudahkan proses pemasaran produk perusahaan.\n" +
                "\n" +
                "Huawei mempekerjakan lebih dari 140.000 orang, sekitar 46% karyawan bekerja di bagian penelitian dan pengembangan produk Huawei. Tercatat lebih dari 20 institusi Penelitian dan Pengembangan tersebar di seluruh dunia termasuk China, Amerika Serikat, Jerman, Kolumbia, Sedia, Irlandia, India, Rusia, dan Turki.."));
        list.add(new ItemClass(R.drawable.microsofticon, "Microsoft", "Microsoft Inonesia.Microsoft Corporation adalah perusahaan multinasional Amerika Serikat yang berkantor pusat di Redmond, Washington, Amerika Serikat yang mengembangkan, membuat, memberi lisensi, dan mendukung berbagai produk dan jasa terkait dengan komputer. Perusahaan ini didirikan oleh Bill Gates dan Paul Allen pada tanggal 4 April 1975. Microsoft merupakan pembuat perangkat lunak terbesar di dunia menurut pendapatannya.."));
        list.add(new ItemClass(R.drawable.dicodingicon, "Dicoding", "Dicoding inc.Dicoding adalah sebuah perusahaan startup yang bertujuan mengembangkan ekosistem developer di Indonesia. Berdiri sejak 5 Januari 2015, Dicoding memiliki platform pembelajaran elektronik di laman Dicoding.com.\n" +
                "Dicoding telah terakreditasi sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia dan menjadi mitra Badan Ekonomi Kreatif ."));

        list.add(new ItemClass(R.drawable.asusiconn, "Asus Company", "Asus inc.ASUS adalah salah satu perusahaan teknologi raksasa yang memudahkan masyarakat dalam menjalani kehidupan sehari-hari di era Industri 4.0 sekarang ini. Perusahaan ASUS didirikan di Taipei, Taiwan pada tahun 1989 oleh T. H. Tung, Ted Hsu, Wayne Hsieh dan M.T. Liao, yang sebelumnya bekerja di Acer sebagai insinyur perangkat keras."));

        recyclerView = findViewById(R.id.id_RecyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        MyAdapter1 adapter = new MyAdapter1(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        adapter.OnRecyclerViewClickListener(new MyAdapter1.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {

                Intent intent = new Intent(Loker_page.this, Detail_loker.class);
                intent.putExtra("imagINTENT", list.get(position).getImg() );
                intent.putExtra("nameINTENT", list.get(position).getName());
                intent.putExtra("emailINTENT", list.get(position).getEmail());
                startActivity(intent);
            }
        });

    }
}