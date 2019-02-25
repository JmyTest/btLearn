<?php
/**
 * 冒泡排序 升序
 * @param array $arr 输入数组
 * @return array 
 */
function bubbleSort (array $arr){
    $size = count($arr);
    if($size<1) {
        return [];
    }
    for($i=0;$i<$size;$i++){
        for($j=$i+1; $j<$size; $j++){
            if($arr[$i] >$arr[$j]){
                //交换位置
                $tem = $arr[$j];
                $arr[$j] = $arr[$i];
                $arr[$i] = $tem;
            }
        }
    }
    return $arr;
}
$a = [1,25,6,7,8,94,8,3,7,6,57,54];
$a = bubbleSort($a);
print_r($a);
?>
