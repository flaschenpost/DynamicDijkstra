Dynamic Dijkstra
================

Tiny lib to use Dijkstra for optimization. "Dynamic" in the sense that knots and
edges are produced as needed, i.e. outgoing edges with weight and target knots
from a knot don't need not be calculated until that knot is evaluated.

Edges may contain a description, knots probably will contain application data.

Restrictions
------------

Weights are Double-Values, Knots have to contain a unique comparator (which
gives identity only for the same application object).
