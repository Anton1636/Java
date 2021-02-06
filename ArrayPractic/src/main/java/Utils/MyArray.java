package Utils;

abstract class MyArray {
    void templateMethod()
    {
        FillArray();
        FillArrayRandomDiget();
        ShowArray();
        MaxValue();
        MinValue();
        ArithmeticMean();
        SortArrayAscending();
        SortArrayDescending();
        BinarySearch();
        ReplacingValueInNewValue();
    }

    protected abstract void ReplacingValueInNewValue();
    protected abstract void BinarySearch();
    protected abstract void SortArrayDescending();
    protected abstract void SortArrayAscending();
    protected abstract void ArithmeticMean();
    protected abstract int MinValue();
    protected abstract int MaxValue();
    protected abstract void ShowArray();
    protected abstract void FillArrayRandomDiget();
    protected abstract void FillArray();
}

