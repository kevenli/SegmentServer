情感分析服务
============

/affective/analyze (POST)
-------------------------
分析文本情感分数

* Parameters:
    * `text` (required, string) - 需要分析的文本，中文需要需要使用utf8编码

* Response:
    * `data` (float)- 情感分析分数，正数为正向，负数为负向，0为中性
    * `status` (string)- ok or error 
* Response Example::

    {
        "status": "ok",
        "data": -1.0
    }