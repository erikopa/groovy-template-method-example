package accumulator

/**
 * Created by erikomorais on 12/10/16.
 */
Closure addAll = { total, item -> total += item }
def accumulated = [1, 2, 3, 4].inject(0, addAll)
println accumulated

Closure multAll = { total, item -> total *= item }
accumulated = [1, 2, 3, 4].inject(1, multAll)
println accumulated