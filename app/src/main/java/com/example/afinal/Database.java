package com.example.afinal;

public class Database {
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
    public static String[] Set_packing_detail = {"Set packing is a classical NP-complete problem in computational complexity theory and combinatorics, and was one of Karp's 21 NP-complete problems.\n" +
            "\n" +
            "Suppose one has a finite set S and a list of subsets of S. Then, the set packing problem asks if some k subsets in the list are pairwise disjoint (in other words, no two of them share an element).\n" +
            "\n" +
            "More formally, given a universe U and a family S of subsets of U, a packing is a subfamily C ⊆ S of sets such that all sets in C are pairwise disjoint. The size of the packing is |C| In the set packing decision problem, the input is a pair (U,S) and an integer K; the question is whether there is a set packing of size K or more. In the set packing optimization problem, the input is a pair (U,S) , and the task is to find a set packing that uses the most sets.\n" +
            "\n" +
            "The problem is clearly in NP since, given k subsets, we can easily verify that they are pairwise disjoint in polynomial time.\n" +
            "\n" +
            "The optimization version of the problem, maximum set packing, asks for the maximum number of pairwise disjoint sets in the list. It is a maximization problem that can be formulated naturally as an integer linear program, belonging to the class of packing problems.\n","The maximum set packing problem can be formulated as the following integer linear program."};

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
    public static String[] Data_mining_detail={"Data mining is a process of extracting and discovering patterns in large data sets involving methods at the intersection of machine learning, statistics, and database systems. Data mining is an interdisciplinary subfield of computer science and statistics with an overall goal to extract information (with intelligent methods) from a data set and transform the information into a comprehensible structure for further use. Data mining is the analysis step of the \"knowledge discovery in databases\" process, or KDD. Aside from the raw analysis step, it also involves database and data management aspects, data pre-processing, model and inference considerations, interestingness metrics, complexity considerations, post-processing of discovered structures, visualization, and online updating.","Data mining involves six common classes of tasks:\n" +
            "\n" +
            "•\tAnomaly detection (outlier/change/deviation detection) – The identification of unusual data records, that might be interesting or data errors that require further investigation.\n" +
            "•\tAssociation rule learning (dependency modeling) – Searches for relationships between variables. For example, a supermarket might gather data on customer purchasing habits. Using association rule learning, the supermarket can determine which products are frequently bought together and use this information for marketing purposes. This is sometimes referred to as market basket analysis.\n" +
            "•\tClustering – is the task of discovering groups and structures in the data that are in some way or another \"similar\", without using known structures in the data.\n" +
            "•\tClassification – is the task of generalizing known structure to apply to new data. For example, an e-mail program might attempt to classify an e-mail as \"legitimate\" or as \"spam\".\n" +
            "•\tRegression – attempts to find a function that models the data with the least error that is, for estimating the relationships among data or datasets.\n" +
            "•\tSummarization – providing a more compact representation of the data set, including visualization and report generation.\n"};
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
    public static String[] Phylogenetics_detail={"In biology, phylogenetics is a part of systematics that addresses the inference of the evolutionary history and relationships among or within groups of organisms (e.g. species, or more inclusive taxa). These relationships are hypothesized by phylogenetic inference methods that evaluate observed heritable traits, such as DNA sequences, protein amino acid sequences, or morphology, often under a specified model of evolution of these traits. The result of such an analysis is a phylogeny (also known as a phylogenetic tree)—a diagrammatic hypothesis of relationships that reflects the evolutionary history of a group of organisms. The tips of a phylogenetic tree can be living taxa or fossils, and represent the 'end', or the present, in an evolutionary lineage. A phylogenetic diagram can be rooted or unrooted. A rooted tree diagram indicates the hypothetical common ancestor, or ancestral lineage, of the tree. An unrooted tree diagram (a network) makes no assumption about the ancestral line, and does not show the origin or \"root\" of the taxa in question or the direction of inferred evolutionary transformations. In addition to their proper use for inferring phylogenetic patterns among taxa, phylogenetic analyses are often employed to represent relationships among gene copies or individual organisms. Such uses have become central to understanding biodiversity, evolution, ecology, and genomes. In February 2021, scientists reported, for the first time, the sequencing of DNA from animal remains, a mammoth in this instance, over a million years old, the oldest DNA sequenced to date.\n" +
            "\n" +
            "Taxonomy is the identification, naming and classification of organisms. Classifications are now usually based on phylogenetic data, and many systematists contend that only monophyletic taxa should be recognized as named groups. The degree to which classification depends on inferred evolutionary history differs depending on the school of taxonomy: phenetics ignores phylogenetic speculation altogether, trying to represent the similarity between organisms instead; cladistics (phylogenetic systematics) tries to reflect phylogeny in its classifications by only recognizing groups based on shared, derived characters (synapomorphies); evolutionary taxonomy tries to take into account both the branching pattern and \"degree of difference\" to find a compromise between them.\n","Usual methods of phylogenetic inference involve computational approaches implementing the optimality criteria and methods of parsimony, maximum likelihood (ML), and MCMC-based Bayesian inference. All these depend upon an implicit or explicit mathematical model describing the evolution of characters observed.\n" +
            "\n" +
            "Phenetics, popular in the mid-20th century but now largely obsolete, used distance matrix-based methods to construct trees based on overall similarity in morphology or similar observable traits (i.e. in the phenotype or the overall similarity of DNA, not the DNA sequence), which was often assumed to approximate phylogenetic relationships.\n" +
            "\n" +
            "Prior to 1950, phylogenetic inferences were generally presented as narrative scenarios. Such methods are often ambiguous and lack explicit criteria for evaluating alternative hypotheses.\n"};
    public static String[] return_np_complete_detail(int pos){
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
}

