import connexion

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.related_terms import RelatedTerms  # noqa: E501
from openapi_server import util


def terms_related_list(terms):  # noqa: E501
    """List related terms

    Get a list of terms logically related to each input term.  Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc. # noqa: E501

    :param terms: List of input terms.
    :type terms: List[str]

    :rtype: RelatedTerms
    """
    return 'do some magic!'


def terms_suggested_list(term, limit=None):  # noqa: E501
    """List suggested terms

    Get popular search terms that begin with your input term.  Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term. # noqa: E501

    :param term: Input term.
    :type term: str
    :param limit: Max suggested terms to return.
    :type limit: int

    :rtype: List[str]
    """
    return 'do some magic!'
