package com.example.afinal;

public class Database<鬆弛的多面體> {
    //store Data class
    public static String[] np_hard_qustion_list = {"Approximate computing", "Data mining",
            "Decision support system", "Phylogenetics"
    };
    public static String[] np_complete_qustion_list = {"integer programming",
            "Set packing", "Set cover problem", "Knapsack problem"
    };
    public static String[][] np_complete_qustion_title_list = {{"Explain", "Example"},
            {"Explain", "Integer linear program formulation"}, {"Explain", "Solution (Greedy Algorithm)"},
            {"Explain", "Solution(Dynamic programming in-advance algorithm)"}
    };
    public static String[][] np_hard_qustion_title_list = {{"Explain", "Strategies"},
            {"Explain", "Type of Data mining"}, {"Explain", "Applications"},
            {"Explain", "Inference of a phylogenetic tree"}
    };
    public static String[] integer_programming_detail = {"An integer programming problem is a mathematical optimization or feasibility program in which some or all of the variables are restricted to be integers. In many settings the term refers to integer linear programming (ILP), in which the objective function and the constraints (other than the integer constraints) are linear.\n" +
            "Integer programming is NP-complete. In particular, the special case of 0-1 integer linear programming, in which unknowns are binary, and only the restrictions must be satisfied, is one of Karp's 21 NP-complete problems.\n" +
            "If some decision variables are not discrete the problem is known as a mixed-integer programming problem.\n",
            "The plot on the right shows the following problem.The feasible integer points are shown in red, and the red dashed lines indicate their convex hull, which is the smallest convex polyhedron that contains all of these points. +" +
                    "The blue lines together with the coordinate axes define the polyhedron of the LP relaxation, which is given by the inequalities without the integrality constraint. +" +
                    "The goal of the optimization is to move the black dotted line as far upward while still touching the polyhedron. The optimal solutions of the integer problem are the points (1,2) and (2,2) which both have an objective value of 2. +" +
                    "The unique optimum of the relaxation is (1.8,2.8)with objective value of 2.8. If the solution of the relaxation is rounded to the nearest integers, it is not feasible for the ILP."};
    public  static String[] integer_programing_detail_chinese ={
            "整數規劃問題是一種數學優化或可行性程序，其中部分或全部變量被限制為整數。在許多設置中，該術語指的是整數線性規劃 (ILP)，其中目標函數和約束（整數約束除外）是線性的。\n" +
            "整數規劃是 NP-完全問題。特別是 0-1 整數線性規劃的特殊情況，其中未知數是二進制的，並且只需要滿足限制條件，是 Karp 的 21 個 NP-完全問題之一。\n" +
            "如果某些決策變量不是離散的，則該問題稱為混合整數規劃問題。\n",
            "右圖顯示了以下問題。可行的整數點用紅色表示，紅色虛線表示它們的凸包，它是包含所有這些點的最小凸多面體。" +
            "藍線與坐標軸一起定義了LP鬆弛的多面體，它由沒有完整性約束的不等式給出。" +
            "優化的目標是將黑色虛線向上移動盡可能遠，同時仍然接觸多面體。整數問題的最優解是點 (1,2) 和 (2,2)，它們的目標值為2. " +
            "鬆弛的唯一最優值是（1.8,2.8），目標值為2.8。如果鬆弛的解四捨五入到最接近的整數，則ILP不可行。"
    };
    public static String[] Set_packing_detail = {"Set packing is a classical NP-complete problem in computational complexity theory and combinatorics, and was one of Karp's 21 NP-complete problems.\n" +
            "\n" +
            "Suppose one has a finite set S and a list of subsets of S. Then, the set packing problem asks if some k subsets in the list are pairwise disjoint (in other words, no two of them share an element).\n" +
            "\n" +
            "More formally, given a universe U and a family S of subsets of U, a packing is a subfamily C ⊆ S of sets such that all sets in C are pairwise disjoint. The size of the packing is |C| In the set packing decision problem, the input is a pair (U,S) and an integer K; the question is whether there is a set packing of size K or more. In the set packing optimization problem, the input is a pair (U,S) , and the task is to find a set packing that uses the most sets.\n" +
            "\n" +
            "The problem is clearly in NP since, given k subsets, we can easily verify that they are pairwise disjoint in polynomial time.\n" +
            "\n" +
            "The optimization version of the problem, maximum set packing, asks for the maximum number of pairwise disjoint sets in the list. It is a maximization problem that can be formulated naturally as an integer linear program, belonging to the class of packing problems.\n","The maximum set packing problem can be formulated as the following integer linear program."};

    public static String[] Set_packing_detail_chinese={"集合打包是計算複雜性理論和組合學中的經典 NP 完全問題，是 Karp 的 21 個 NP 完全問題之一。\n" +
            "\n" +
            "假設一個人有一個有限集 S 和一個 S 的子集列表。然後，集合打包問題詢問列表中的某些 k 個子集是否成對不相交（換句話說，它們中沒有兩個共享一個元素）。\n" +
            "\n" +
            "更正式地說，給定一個宇宙 U 和一個 U 的子集族 S，一個包裝是一個子族 C ⊆ S 的集合，使得 C 中的所有集合都是成對不相交的。包裝的大小是 |C| 在集合包裝中決策問題，輸入是一對(U,S)和一個整數K；問題是是否存在一個大小為K或更大的集合打包。在集合打包優化問題中，輸入是一對(U,S) , 任務是找到一個使用最多集合的集合包裝。\n" +
            "\n" +
            "問題顯然出在 NP 中，因為給定 k 個子集，我們可以輕鬆驗證它們在多項式時間內是成對不相交的。\n" +
            "\n" +
            "問題的優化版本，最大集合打包，要求列表中成對不相交集的最大數量。它是一個最大化問題，可以自然地表述為整數線性規劃，屬於打包問題的類。\n"
            ,"最大集合包裝問題可以表述為以下整數線性規劃。"};
    public static String[] Set_cover_problem_detail = {"The set cover problem is a classical question in combinatorics, computer science, operations research, and complexity theory. It is one of Karp's 21 NP-complete problems shown to be NP-complete in 1972.\n" +
            "It is a problem \"whose study has led to the development of fundamental techniques for the entire field\" of approximation algorithms.\n" +
            "Given a set of elements {1,2,,,,n} (called the universe) and a collection S of m sets whose union equals the universe, the set cover problem is to identify the smallest sub-collection of S whose union equals the universe. For example, consider the universe U={1,2,3,4,5} and the collection of sets S={{1,2,3},{2,4},{3,4},{4,5}} . Clearly the union of S is U . However, we can cover all of the elements with the following, smaller number of sets: {{1,2,3},{4,5}}.\n" +
            "More formally, given a universe U and a family S of subsets of U , a cover is a subfamily   of sets whose union is U. In the set covering decision problem, the input is a pair (U,S) and an integer k; the question is whether there is a set covering of size k or less. In the set covering optimization problem, the input is a pair (U,S), and the task is to find a set covering that uses the fewest sets.\n" +
            "The decision version of set covering is NP-complete, and the optimization/search version of set cover is NP-hard.\n" +
            "If each set is assigned a cost, it becomes a weighted set cover problem.\n","Let U be the universe of elements, {S1, S2, … Sm} be collection of subsets of U and Cost(S1), C(S2), … Cost(Sm) be costs of subsets.\n" +
            "1) Let I represents set of elements included so far.  Initialize I = {}\n" +
            "\n" +
            "2) Do following while I is not same as U.\n" +
            "    a) Find the set Si in {S1, S2, ... Sm} whose cost effectiveness is \n" +
            "       smallest, i.e., the ratio of cost C(Si) and number of newly added \n" +
            "       elements is minimum. \n" +
            "       Basically we pick the set for which following value is minimum.\n" +
            "           Cost(Si) / |Si - I|\n" +
            "    b) Add elements of above picked Si to I, i.e.,  I = I U Si\n"};
    public static String[] Set_cover_problem_detail_chinese={
        "集合覆蓋問題是組合學、計算機科學、運籌學和復雜性理論中的一個經典問題。它是 Karp 的 21 個 NP 完全問題之一，在 1972 年被證明是 NP 完全問題。\n" +
                "“這是一個問題，”其研究導致了近似算法整個領域的基本技術的發展。\n" +
                "給定一組元素{1,2,,,,n}（稱為全域）和一個並集等於全域的m個集合的集合S，集合覆蓋問題是確定S的並集最小的子集合等於宇宙。例如，考慮宇宙 U={1,2,3,4,5} 和集合 S={{1,2,3},{2,4},{3,4} ,{4,5}} . 顯然 S 的並集是 U 。但是，我們可以用以下較少數量的集合覆蓋所有元素：{{1,2,3},{4,5}}。 \\n\" +\n" +
                "更正式地說，給定一個宇宙 U 和一個 U 的子集族 S，覆蓋是集合的子族，其並集為 U。在集合覆蓋決策問題中，輸入是一對 (U,S) 和整數 k ; 問題是是否存在大小為k或更小的集合覆蓋。在集合覆蓋優化問題中，輸入是一對(U,S)，任務是找到一個使用最少集合的集合覆蓋。 n\" +\n" +
                "集合覆蓋的決策版本是NP-完全的，集合覆蓋的優化/搜索版本是NP-hard的。\n" +
                "如果每個集合都分配了一個成本，它就變成了一個加權集覆蓋問題。\\n\",\"讓 U 是元素的宇宙，{S1, S2, ... Sm} 是 U 和 Cost(S1) 的子集的集合， C(S2), ... Cost(Sm) 是子集的成本。\\n\" +\n" +
                "1) 讓 I 表示到目前為止包含的元素集。初始化 I = {}\n" +
                "\n" +
                "2) 在 I 和 U 不一樣的情況下做跟隨。\n" +
                "a) 在 {S1, S2, ... Sm} 中找到成本效率為 Si 的集合\n" +
                "最小，即成本 C(Si) 與新增數量之比\n" +
                "元素最少。\n" +
                "基本上我們選擇以下值最小的集合。\n" +
                "成本(Si) / |Si - I|\n" +
                "b) 將上面選取的 Si 的元素加到 I 中，即 I = I U Si\n"
    };
    public static String[] Knapsack_problem_detail = {"Knapsack Problem algorithm is a very helpful problem in combinatorics. In the supermarket there are n packages (n ≤ 100) the package i has weight W[i] ≤ 100 and value V[i] ≤ 100. A thief breaks into the supermarket, the thief cannot carry weight exceeding M (M ≤ 100).\n" +
            "The knapsack problem has been studied for more than a century, with early works dating as far back as 1897.The name \"knapsack problem\" dates back to the early works of the mathematician Tobias Dantzig (1884–1956),and refers to the commonplace problem of packing the most valuable or useful items without overloading the luggage.\n",
            "In the divide-and-conquer strategy, you divide the problem to be solved into subproblems. The subproblems are further divided into smaller subproblems. That task will continue until you get subproblems that can be solved easily. However, in the process of such division, you may encounter the same problem many times.\n" +
                    "\n" +
                    "The basic idea of Knapsack dynamic programming is to use a table to store the solutions of solved subproblems. If you face a subproblem again, you just need to take the solution in the table without having to solve it again. Therefore, the algorithms designed by dynamic programming are very effective.\n" +
                    "To solve a problem by dynamic programming, you need to do the following tasks:\n" +
                    "•\tFind solutions of the smallest subproblems.\n" +
                    "•\tFind out the formula (or rule) to build a solution of subproblem through solutions of even smallest subproblems.\n" +
                    "•\tCreate a table that stores the solutions of subproblems. Then calculate the solution of subproblem according to the found formula and save to the table.\n" +
                    "•\tFrom the solved subproblems, you find the solution of the original problem.\n"};
    public static String[] Knapsack_problem_detail_chinese ={"背包問題算法是組合學中一個非常有用的問題。超市有n個包裹（n≤100），包裹i的重量W[i]≤100，價值V[i]≤100。小偷闖入超市，小偷攜帶的重量不能超過M（M≤100） ).\n" +
            "背包問題已經研究了一個多世紀，早期作品可以追溯到 1897 年。“背包問題”這個名字可以追溯到數學家 Tobias Dantzig (1884-1956) 的早期作品，指的是解決在不讓行李超載的情況下打包最有價值或最有用的物品的常見問題。\n" +
            "在分而治之的策略中，你將要解決的問題劃分為子問題。子問題進一步劃分為更小的子問題。這個任務將繼續進行，直到你得到可以輕鬆解決的子問題。然而，在這樣的過程中分，你可能會多次遇到同樣的問題。\n" +
            "\n" +
            "背包動態規劃的基本思想是用一張表來存儲已解決的子問題的解。如果你再次遇到一個子問題，你只需要取表中的解，而不必再次解決它。因此，設計的算法通過動態規劃非常有效。\n" +
            "要通過動態規劃解決問題，您需要完成以下任務：\n" +
            "•\t求最小子問題的解。\n" +
            "•\t找出通過最小子問題的解來構建子問題解的公式（或規則）。\n" +
            "•\t創建一個表，存儲子問題的解。然後根據找到的公式計算子問題的解並保存到表中。\n" +
            "•\t從已解決的子問題中，您可以找到原始問題的解決方案。\n"};
    public static String[] Approximate_computing_detail={"Approximate computing is an emerging paradigm for energy-efficient and/or high-performance design. It includes a plethora of computation techniques that return a possibly inaccurate result rather than a guaranteed accurate result, and that can be used for applications where an approximate result is sufficient for its purpose. One example of such situation is for a search engine where no exact answer may exist for a certain search query and hence, many answers may be acceptable. Similarly, occasional dropping of some frames in a video application can go undetected due to perceptual limitations of humans. Approximate computing is based on the observation that in many scenarios, although performing exact computation requires large amount of resources, allowing bounded approximation can provide disproportionate gains in performance and energy, while still achieving acceptable result accuracy. For example, in k-means clustering algorithm, allowing only 5% loss in classification accuracy can provide 50 times energy saving compared to the fully accurate classification.\n" +
            "\n" +
            "The key requirement in approximate computing is that approximation can be introduced only in non-critical data, since approximating critical data (e.g., control operations) can lead to disastrous consequences, such as program crash or erroneous output.\n","Several strategies can be used for performing approximate computing.\n" +
            "Approximate circuits\n" +
            "Approximate arithmetic circuits: adders, multipliers and other logical circuits can reduce hardware overhead. For example, an approximate multi-bit adder can ignore the carry chain and thus, allow all its sub-adders to perform addition operation in parallel.\n" +
            "Approximate storage\n" +
            "Instead of storing data values exactly, they can be stored approximately, e.g., by truncating the lower-bits in floating point data. Another method is to accept less reliable memory. For this, in DRAM and eDRAM, refresh rate assignments can be lowered or controlled. In SRAM, supply voltage can be lowered or controlled. Approximate storage can be applied to reduce MRAM's high write energy consumption. In general, any error detection and correction mechanisms should be disabled.\n" +
            "Software-level approximation\n" +
            "There are several ways to approximate at software level. Memoization can be applied. Some iterations of loops can be skipped (termed as loop perforation) to achieve a result faster. Some tasks can also be skipped, for example when a run-time condition suggests that those tasks are not going to be useful (task skipping). Monte Carlo algorithms and Randomized algorithms trade correctness for execution time guarantees. The computation can be reformulated according to paradigms that allow easily the acceleration on specialized hardware, e.g. a neural processing unit.\n" +
            "Approximate system\n" +
            "In an approximate system, different subsystems of the system such as the processor, memory, sensor, and communication modules are synergistically approximated to obtain a much better system-level Q-E trade-off curve compared to individual approximations to each of the subsystems.\n\n\nApproximate computing has been used in a variety of domains where the applications are error-tolerant, such as multimedia processing, machine learning, signal processing, scientific computing. Therefore, approximate computing is mostly driven by applications that are related to human perception/cognition and have inherent error resilience. Many of these applications are based on statistical or probabilistic computation, such as different approximations can be made to better suit the desired objectives.One notable application in machine learning is that Google is using this approach in their Tensor processing units (TPU, a custom ASIC). "};
    public static String[] Approximate_computing_detail_chinese={
            "近似計算是一種新興的節能和/或高性能設計範式。 它包括大量的計算科技，這些科技返回可能不準確的結果，而不是保證準確的結果，並且可用於近似結果足以滿足其目的的應用。 這種情況的一個例子是搜尋引擎，其中某個蒐索査詢可能不存在確切的答案，囙此，許多答案可能是可以接受的。 類似地，由於人類的感知局限性，視頻應用程序中某些幀的偶爾遺失可能無法被檢測到。 近似計算基於以下觀察結果：在許多情况下，儘管執行精確計算需要大量資源，但允許有界近似可以在效能和能量方面提供不成比例的增益，同時仍能獲得可接受的結果精度。 例如，在k-means聚類演算法中，僅允許5%的分類精度損失，與完全準確的分類相比，可以提供50倍的節能。 \n" +
            "+\n" +
            "近似計算的關鍵要求是只能在非關鍵數據中引入近似，因為近似關鍵數據（如控制操作）可能導致災難性後果，如程式崩潰或輸出錯誤。\n可以使用幾種策略來執行近似計算。\n" +
            "近似電路\n" +
            "近似算術電路：加法器、乘法器和其他邏輯電路可以减少硬體開銷。例如，近似多位加法器可以忽略進位鏈，從而允許其所有子加法器並行執行加法運算。\n" +
            "近似存儲\n" +
            "與其精確存儲數據值，還可以近似存儲數據值，例如，通過截斷浮點數據中的低位。另一種方法是接受可靠性較低的記憶體。為此，在DRAM和eDRAM中，刷新率分配可以降低或控制。在SRAM中，電源電壓可以降低或控制。近似存儲可以 用於降低MRAM的高寫入能耗。 通常，應禁用任何錯誤檢測和糾正機制。 \n" +
            "軟件級近似值\n" +
            "有幾種方法可以在軟件級別進行近似。可以應用記憶。可以跳過迴圈的某些反覆運算（稱為迴圈穿孔），以更快地獲得結果。也可以跳過某些任務，例如，當運行時條件表明這些任務沒有用時（任務跳過） . 蒙特卡羅演算法和隨機算灋以正確性換取執行時間保證。 計算可以根據範例進行重新表述，該範例允許在專用硬體（例如，神經處理單元）上輕鬆加速。 \n" +
            "近似系統\n" +
            "在近似系統中，系統的不同子系統（如處理器、記憶體、感測器和通信模塊）協同近似，以獲得比每個子系統的單獨近似更好的系統級Q-E折衷曲線。\n\n\n近似計算已在許多領域中使用。” 這些應用具有容錯性，如多媒體處理、機器學習、信號處理、科學計算等。 囙此，近似計算主要由與人類感知/認知相關且具有固有錯誤恢復能力的應用程序驅動。 這些應用中有許多是基於統計或概率計算的，例如可以做出不同的近似值，以更好地滿足預期目標。 機器學習中一個值得注意的應用是，穀歌在其張量處理單元（TPU，一種定制ASIC）中使用了這種方法。 "};
    public static String[] Data_mining_detail={"Data mining is a process of extracting and discovering patterns in large data sets involving methods at the intersection of machine learning, statistics, and database systems. Data mining is an interdisciplinary subfield of computer science and statistics with an overall goal to extract information (with intelligent methods) from a data set and transform the information into a comprehensible structure for further use. Data mining is the analysis step of the \"knowledge discovery in databases\" process, or KDD. Aside from the raw analysis step, it also involves database and data management aspects, data pre-processing, model and inference considerations, interestingness metrics, complexity considerations, post-processing of discovered structures, visualization, and online updating.","Data mining involves six common classes of tasks:\n" +
            "\n" +
            "•\tAnomaly detection (outlier/change/deviation detection) – The identification of unusual data records, that might be interesting or data errors that require further investigation.\n" +
            "•\tAssociation rule learning (dependency modeling) – Searches for relationships between variables. For example, a supermarket might gather data on customer purchasing habits. Using association rule learning, the supermarket can determine which products are frequently bought together and use this information for marketing purposes. This is sometimes referred to as market basket analysis.\n" +
            "•\tClustering – is the task of discovering groups and structures in the data that are in some way or another \"similar\", without using known structures in the data.\n" +
            "•\tClassification – is the task of generalizing known structure to apply to new data. For example, an e-mail program might attempt to classify an e-mail as \"legitimate\" or as \"spam\".\n" +
            "•\tRegression – attempts to find a function that models the data with the least error that is, for estimating the relationships among data or datasets.\n" +
            "•\tSummarization – providing a more compact representation of the data set, including visualization and report generation.\n"};
    public static String[] Data_mining_detail_chinese={"數據挖掘是在大數據集中提取和發現模式的過程，涉及機器學習、統計和數據庫系統交叉點的方法。數據挖掘是計算機科學和統計學的跨學科子領域，其總體目標是從數據集中提取信息（使用智能方法）並將信息轉換為可理解的結構以供進一步使用。數據挖掘是“數據庫中的知識發現”過程或KDD的分析步驟。除了原始分析步驟，它還涉及數據庫和數據管理方面、數據預處理、模型和推理考慮、興趣度指標、複雜性考慮、發現結構的後處理、可視化和在線更新。\n" +
            "\n" +
            "•\t異常檢測（異常值/變化/偏差檢測）——識別異常數據記錄，可能是有趣的或需要進一步調查的數據錯誤。\n" +
            "•\t關聯規則學習（依賴建模) – 搜索變量之間的關係。例如，超市可能會收集有關客戶購買習慣的數據。使用關聯規則學習，超市可以確定哪些產品經常一起購買，並將這些信息用於營銷目的。這有時被稱為作為購物籃分析。\n" +
            "•\tClustering – 是在不使用數據中已知結構的情況下，發現數據中以某種方式“相似”的組和結構的任務。\n" +
            "•\tClassification – 是將已知結構概括為適用於新數據的任務。例如，電子郵件程序可能會嘗試將電子郵件分類為“合法”或“垃圾郵件”。\n" +
            "•\tRegression – 嘗試找到一個以最小誤差對數據建模的函數，即用於估計數據或數據集之間的關係。\n" +
            "•\tSummarization – 提供更緊湊的數據集表示，包括可視化和報告生成。\n"};
    public static String[] Decision_support_system_detail={"A decision support system (DSS) is an information system that supports business or organizational decision-making activities. DSSs serve the management, operations and planning levels of an organization (usually mid and higher management) and help people make decisions about problems that may be rapidly changing and not easily specified in advance—i.e. unstructured and semi-structured decision problems. Decision support systems can be either fully computerized or human-powered, or a combination of both.\n" +
            "\n" +
            "While academics have perceived DSS as a tool to support decision making processes, DSS users see DSS as a tool to facilitate organizational processes. Some authors have extended the definition of DSS to include any system that might support decision making and some DSS include a decision-making software component; Sprague (1980) defines a properly termed DSS as follows:\n" +
            "\n" +
            "DSS tends to be aimed at the less well structured, underspecified problem that upper level managers typically face;\n" +
            "DSS attempts to combine the use of models or analytic techniques with traditional data access and retrieval functions;\n" +
            "DSS specifically focuses on features which make them easy to use by non-computer-proficient people in an interactive mode; and\n" +
            "DSS emphasizes flexibility and adaptability to accommodate changes in the environment and the decision making approach of the user.\n" +
            "DSSs include knowledge-based systems. A properly designed DSS is an interactive software-based system intended to help decision makers compile useful information from a combination of raw data, documents, and personal knowledge, or business models to identify and solve problems and make decisions.\n" +
            "\n" +
            "Typical information that a decision support application might gather and present includes:\n" +
            "•\tinventories of information assets (including legacy and relational data sources, cubes, data warehouses, and data marts),\n" +
            "•\tcomparative sales figures between one period and the next,\n" +
            "•\tprojected revenue figures based on product sales assumptions.\n","DSS can theoretically be built in any knowledge domain. One example is the clinical decision support system for medical diagnosis. There are four stages in the evolution of clinical decision support system (CDSS): the primitive version is standalone and does not support integration; the second generation supports integration with other medical systems; the third is standard-based, and the fourth is service model-based.\n" +
            "\n" +
            "DSS is extensively used in business and management. Executive dashboard and other business performance software allow faster decision making, identification of negative trends, and better allocation of business resources. Due to DSS, all the information from any organization is represented in the form of charts, graphs i.e. in a summarized way, which helps the management to take strategic decisions. For example, one of the DSS applications is the management and development of complex anti-terrorism systems. Other examples include a bank loan officer verifying the credit of a loan applicant or an engineering firm that has bids on several projects and wants to know if they can be competitive with their costs.\n" +
            "\n" +
            "A growing area of DSS application, concepts, principles, and techniques is in agricultural production, marketing for sustainable development. Agricultural DSSes began to be developed and promoted in the 1990s. For example, the DSSAT4 package, The Decision Support System for Agrotechnology Transfer developed through financial support of USAID during the 80s and 90s, has allowed rapid assessment of several agricultural production systems around the world to facilitate decision-making at the farm and policy levels. Precision agriculture seeks to tailor decisions to particular portions of farm fields. There are, however, many constraints to the successful adoption of DSS in agriculture.\n" +
            "\n" +
            "DSS is also prevalent in forest management where the long planning horizon and the spatial dimension of planning problems demands specific requirements. All aspects of Forest management, from log transportation, harvest scheduling to sustainability and ecosystem protection have been addressed by modern DSSs. In this context, the consideration of single or multiple management objectives related to the provision of goods and services that traded or non-traded and often subject to resource constraints and decision problems. The Community of Practice of Forest Management Decision Support Systems provides a large repository on knowledge about the construction and use of forest Decision Support Systems.\n" +
            "\n" +
            "A specific example concerns the Canadian National Railway system, which tests its equipment on a regular basis using a decision support system. A problem faced by any railroad is worn-out or defective rails, which can result in hundreds of derailments per year. Under a DSS, the Canadian National Railway system managed to decrease the incidence of derailments at the same time other companies were experiencing an increase.\n" +
            "\n" +
            "DSS has been used for risk assessment to interpret monitoring data from large engineering structures such as dams, towers, cathedrals, or masonry buildings. For instance, Mistral is an expert system to monitor dam safety, developed in the 1990s by Ismes (Italy). It gets data from an automatic monitoring system and performs a diagnosis of the state of the dam. Its first copy, installed in 1992 on the Ridracoli Dam (Italy), is still operational 24/7/365. It has been installed on several dams in Italy and abroad (e.g., Itaipu Dam in Brazil), and on monuments under the name of Kaleidos. Mistral is a registered trade mark of CESI. GIS has been successfully used since the ‘90s in conjunction with DSS, to show on a map real-time risk evaluations based on monitoring data gathered in the area of the Val Pola disaster (Italy). \n"};
    public static String[] Decision_support_system_detail_chinese={"決策支持系統 (DSS) 是支持業務或組織決策活動的信息系統。DSS 為組織的管理、運營和規劃級別（通常是中層和高層管理人員）提供服務，並幫助人們對可能快速變化且不易預先指定的問題（即非結構化和半結構化決策問題）做出決策。決策支持系統可以是完全計算機化的或人力驅動的，也可以是兩者的結合。\\n\" +\n" +
            "\n" +
            "“雖然學術界將 DSS 視為支持決策過程的工具，但 DSS 用戶將 DSS 視為促進組織過程的工具。一些作者將 DSS 的定義擴展到包括任何可能支持決策制定的系統，而一些 DSS 包括決策- 製作軟件組件；Sprague (1980) 定義了一個正確命名的 DSS 如下：\n" +
            "\n" +
            "DSS 往往針對的是高層管理人員通常面臨的結構欠佳、未詳細說明的問題；\n" +
            "DSS 嘗試將模型或分析技術的使用與傳統的數據訪問和檢索功能相結合；\n" +
            "DSS 特別關注使非計算機熟練人員在交互模式下易於使用的功能；和\n" +
            "DSS 強調靈活性和適應性，以適應環境和用戶決策方法的變化。\n" +
            "DSS 包括基於知識的系統。設計合理的 DSS 是一種基於交互式軟件的系統，旨在幫助決策者編譯來自原始數據、文檔和個人知識或業務模型的組合的有用信息，用於識別和解決問題並做出決策。\n" +
            "\n" +
            "決策支持應用程序可能收集和呈現的典型信息包括： \n" +
            "•\t信息資產庫存（包括遺留和關係數據源、多維數據集、數據倉庫和數據集市），\n" +
            "•\t一個時期和下一個時期之間的比較銷售數字，\n" +
            "•\t基於產品銷售假設的預計收入數字。\n","DSS理論上可以建立在任何知識領域。一個例子是醫學診斷的臨床決策支持系統。臨床決策支持的演進有四個階段系統（CDSS）：原始版本為單機版，不支持集成；二代支持與其他醫療系統集成；三代基於標準，四代基於服務模型。\n" +
            "\n" +
            "DSS 廣泛用於商業和管理。執行儀表板和其他業務績效軟件允許更快地做出決策、識別負面趨勢以及更好地分配業務資源。由於 DSS，來自任何組織的所有信息都以圖表的形式表示，即以匯總的方式，這有助於管理層做出戰略決策。例如，DSS 應用之一是複雜反恐系統的管理和開發。其他示例包括銀行信貸員核實貸款申請人的信用，或者工程公司對多個項目進行投標並想知道他們的成本是否具有競爭力。\n" +
            "\n" +
            "DSS 應用、概念、原則和技術的一個不斷增長的領域是農業生產、可持續發展營銷。農業 DSS 於 1990 年代開始開發和推廣。例如，DSSAT4 包，農業技術轉讓決策支持系統在 80 年代和 90 年代通過美國國際開發署的財政支持開發的，允許對世界各地的幾個農業生產系統進行快速評估，以促進農場和政策層面的決策。精準農業旨在針對農田的特定部分制定決策。有然而，在農業中成功採用 DSS 有許多限制。\n" +
            "\n" +
            "DSS 在森林管理中也很普遍，其中規劃問題的長期規劃和空間維度需要特定要求。現代 DSS 已經解決了森林管理的所有方面，從原木運輸、收穫計劃到可持續性和生態系統保護。在這方面背景下，考慮與提供貿易或非貿易商品和服務相關的單個或多個管理目標，並經常受到資源限制和決策問題的影響。森林管理決策支持系統實踐社區提供了一個大型知識庫關於森林決策支持系統的構建和使用。\n" +
            "\n" +
            "一個具體的例子涉及加拿大國家鐵路系統，它使用決策支持系統定期測試其設備。任何鐵路面臨的問題都是磨損或有缺陷的軌道，這可能導致每年數百次脫軌。下DSS，加拿大國家鐵路系統設法降低了脫軌的發生率，同時其他公司的脫軌率也在增加。\n" +
            "\n" +
            "DSS 已被用於風險評估，以解釋來自大壩、塔樓、大教堂或磚石建築等大型工程結構的監測數據。例如，Mistral 是一種監測大壩安全的專家系統，由 Ismes（意大利）於 1990 年代開發. 它從自動監測系統獲取數據並對大壩的狀態進行診斷。它的第一個副本於 1992 年安裝在 Ridracoli 大壩（意大利）上，現在仍在 24/7/365 運行。它已安裝在幾個意大利和國外的水壩（例如巴西的伊泰普水壩），以及 Kaleidos 名下的紀念碑。Mistral 是 CESI 的註冊商標。自 20 世紀 90 年代以來，GIS 已成功與 DSS 結合使用，以顯示在根據在 Val Pola 災難（意大利）地區收集的監測數據繪製實時風險評估圖。\n"};
    public static String[] Phylogenetics_detail={"In biology, phylogenetics is a part of systematics that addresses the inference of the evolutionary history and relationships among or within groups of organisms (e.g. species, or more inclusive taxa). These relationships are hypothesized by phylogenetic inference methods that evaluate observed heritable traits, such as DNA sequences, protein amino acid sequences, or morphology, often under a specified model of evolution of these traits. The result of such an analysis is a phylogeny (also known as a phylogenetic tree)—a diagrammatic hypothesis of relationships that reflects the evolutionary history of a group of organisms. The tips of a phylogenetic tree can be living taxa or fossils, and represent the 'end', or the present, in an evolutionary lineage. A phylogenetic diagram can be rooted or unrooted. A rooted tree diagram indicates the hypothetical common ancestor, or ancestral lineage, of the tree. An unrooted tree diagram (a network) makes no assumption about the ancestral line, and does not show the origin or \"root\" of the taxa in question or the direction of inferred evolutionary transformations. In addition to their proper use for inferring phylogenetic patterns among taxa, phylogenetic analyses are often employed to represent relationships among gene copies or individual organisms. Such uses have become central to understanding biodiversity, evolution, ecology, and genomes. In February 2021, scientists reported, for the first time, the sequencing of DNA from animal remains, a mammoth in this instance, over a million years old, the oldest DNA sequenced to date.\n" +
            "\n" +
            "Taxonomy is the identification, naming and classification of organisms. Classifications are now usually based on phylogenetic data, and many systematists contend that only monophyletic taxa should be recognized as named groups. The degree to which classification depends on inferred evolutionary history differs depending on the school of taxonomy: phenetics ignores phylogenetic speculation altogether, trying to represent the similarity between organisms instead; cladistics (phylogenetic systematics) tries to reflect phylogeny in its classifications by only recognizing groups based on shared, derived characters (synapomorphies); evolutionary taxonomy tries to take into account both the branching pattern and \"degree of difference\" to find a compromise between them.\n","Usual methods of phylogenetic inference involve computational approaches implementing the optimality criteria and methods of parsimony, maximum likelihood (ML), and MCMC-based Bayesian inference. All these depend upon an implicit or explicit mathematical model describing the evolution of characters observed.\n" +
            "\n" +
            "Phenetics, popular in the mid-20th century but now largely obsolete, used distance matrix-based methods to construct trees based on overall similarity in morphology or similar observable traits (i.e. in the phenotype or the overall similarity of DNA, not the DNA sequence), which was often assumed to approximate phylogenetic relationships.\n" +
            "\n" +
            "Prior to 1950, phylogenetic inferences were generally presented as narrative scenarios. Such methods are often ambiguous and lack explicit criteria for evaluating alternative hypotheses.\n"};
    public static String[] Phylogenetics_detail_chinese={"在生物學中，系統發育學是系統學的一部分，它處理進化歷史和生物群之間或群內關係的推論（例如物種或更具包容性的分類群）。這些關係是通過系統發育推斷方法假設的，該方法通常在這些性狀的特定進化模型下評估觀察到的遺傳性狀，例如 DNA 序列、蛋白質氨基酸序列或形態。這種分析的結果是系統發育（也稱為系統發育樹）——一種反映一組生物進化歷史的關係圖解假設。系統發育樹的尖端可以是活的分類群或化石，代表進化譜系中的“結束”或現在。系統發育圖可以是有根的或無根的。有根樹圖表示樹的假設共同祖先或祖先譜系。無根樹狀圖（網絡）不對祖先譜係做任何假設，也不顯示相關類群的起源或“根”或推斷的進化轉變方向。除了適當用於推斷分類群之間的系統發育模式外，系統發育分析還經常用於表示基因拷貝或個體生物之間的關係。這種用途已成為理解生物多樣性、進化、生態和基因組的核心。2021 年 2 月，科學家們首次報告了對動物遺骸的 DNA 測序，在這種情況下是猛獁象，已有超過一百萬年的歷史，是迄今為止測序的最古老的 DNA。\n" +
            "\n" +
            "系統發育推斷的常用方法涉及實現最優性標準和簡約方法、最大似然 (ML) 和基於 MCMC 的貝葉斯推斷的計算方法。所有這些都依賴於描述所觀察到的字符演變的隱式或顯式數學模型。\n" +
            "\n" +
            "Phenetics，在 20 世紀中葉流行，但現在基本上已經過時，它使用基於距離矩陣的方法根據形態學的整體相似性或相似的可觀察性狀（即表型或 DNA 的整體相似性）構建樹，而不是 DNA 序列），這通常被假定為近似系統發育關係。\n" +
            "\n" +
            "在 1950 年之前，系統發育推斷通常以敘述性場景的形式呈現。此類方法通常含糊不清，缺乏明確的評估標準替代假設。\n"};
    public static String[] np_complete_link={
      "<a href='https://en.wikipedia.org/wiki/Integer_programming'>wiki 連結</a>","<a href='https://en.wikipedia.org/wiki/Set_packing'>wiki 連結</a>","<a href='https://en.wikipedia.org/wiki/Set_cover_problem'>wiki 連結</a>","<a href='https://en.wikipedia.org/wiki/Knapsack_problem'>wiki 連結</a>"
    };
    public static String[] np_hard_link={
            "<a href='https://en.wikipedia.org/wiki/Approximate_computing'>wiki 連結</a>","<a href='https://en.wikipedia.org/wiki/Data_mining'>wiki 連結</a>","<a href='https://en.wikipedia.org/wiki/Decision_support_system'>wiki 連結</a>","<a href='https://en.wikipedia.org/wiki/Phylogenetics'>wiki 連結</a>"
    };
    public static String[] return_np_complete_detail(int pos){
        //to return data depend pos
        if (pos==0){
            return integer_programming_detail;
        }
       else if(pos==1){
           return Set_packing_detail;
        }
       else if(pos==2){
           return Set_cover_problem_detail;
        }
       else{
           return Knapsack_problem_detail;
        }
    }
    public static String[] return_np_hard_detail(int pos){
        if (pos==0){
            return Approximate_computing_detail;
        }
        else if (pos==1){
            return Data_mining_detail;
        }
        else if (pos==2){
            return Decision_support_system_detail;
        }
        else{
            return Phylogenetics_detail;
        }
    }
    public static String[] return_np_complete_detail_chinese(int pos){
        //to return data depend pos
        if (pos==0){
            return integer_programing_detail_chinese;
        }
        else if(pos==1){
            return Set_packing_detail_chinese;
        }
        else if(pos==2){
            return Set_cover_problem_detail_chinese;
        }
        else{
            return Knapsack_problem_detail_chinese;
        }
    }
    public static String[] return_np_hard_detail_chinese(int pos){
        if (pos==0){
            return Approximate_computing_detail_chinese;
        }
        else if (pos==1){
            return Data_mining_detail_chinese;
        }
        else if (pos==2){
            return Decision_support_system_detail_chinese;
        }
        else{
            return Phylogenetics_detail_chinese;
        }
    }

}

