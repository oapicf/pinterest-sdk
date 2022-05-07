# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.catalogs_feed import CatalogsFeed  # noqa: F401
from openapi_server.models.catalogs_feeds_create_request import CatalogsFeedsCreateRequest  # noqa: F401
from openapi_server.models.catalogs_feeds_update_request import CatalogsFeedsUpdateRequest  # noqa: F401
from openapi_server.models.catalogs_items import CatalogsItems  # noqa: F401
from openapi_server.models.catalogs_items_batch import CatalogsItemsBatch  # noqa: F401
from openapi_server.models.catalogs_items_batch_request import CatalogsItemsBatchRequest  # noqa: F401
from openapi_server.models.catalogs_product_group import CatalogsProductGroup  # noqa: F401
from openapi_server.models.catalogs_product_group_create_request import CatalogsProductGroupCreateRequest  # noqa: F401
from openapi_server.models.catalogs_product_group_update_request import CatalogsProductGroupUpdateRequest  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.paginated import Paginated  # noqa: F401


def test_catalogs_product_groups_create(client: TestClient):
    """Test case for catalogs_product_groups_create

    Create product group
    """
    catalogs_product_group_create_request = {"name":"name","description":"description","feed_id":"2680059592705"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/catalogs/product_groups",
        headers=headers,
        json=catalogs_product_group_create_request,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_delete(client: TestClient):
    """Test case for catalogs_product_groups_delete

    Delete product group
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "DELETE",
        "/catalogs/product_groups/{product_group_id}".format(product_group_id='product_group_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_list(client: TestClient):
    """Test case for catalogs_product_groups_list

    Get product groups list
    """
    params = [("feed_id", 'feed_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/catalogs/product_groups",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_update(client: TestClient):
    """Test case for catalogs_product_groups_update

    Update product group
    """
    catalogs_product_group_update_request = {"name":"name","description":"description","feed_id":"2680059592705"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "PATCH",
        "/catalogs/product_groups/{product_group_id}".format(product_group_id='product_group_id_example'),
        headers=headers,
        json=catalogs_product_group_update_request,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feed_processing_results_list(client: TestClient):
    """Test case for feed_processing_results_list

    List processing results for a given feed
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/catalogs/feeds/{feed_id}/processing_results".format(feed_id='feed_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_create(client: TestClient):
    """Test case for feeds_create

    Create feed
    """
    catalogs_feeds_create_request = {"credentials":{"password":"password","username":"username"},"name":"name","preferred_processing_schedule":{"timezone":"Africa/Abidjan","time":"02:59"},"default_locale":"en_US","location":"location","default_currency":"USD","default_country":"US"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/catalogs/feeds",
        headers=headers,
        json=catalogs_feeds_create_request,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_delete(client: TestClient):
    """Test case for feeds_delete

    Delete feed
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "DELETE",
        "/catalogs/feeds/{feed_id}".format(feed_id='feed_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_get(client: TestClient):
    """Test case for feeds_get

    Get feed
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/catalogs/feeds/{feed_id}".format(feed_id='feed_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_list(client: TestClient):
    """Test case for feeds_list

    List feeds
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/catalogs/feeds",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_feeds_update(client: TestClient):
    """Test case for feeds_update

    Update feed
    """
    catalogs_feeds_update_request = {"credentials":{"password":"password","username":"username"},"name":"name","preferred_processing_schedule":{"timezone":"Africa/Abidjan","time":"02:59"},"location":"location","default_currency":"USD"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "PATCH",
        "/catalogs/feeds/{feed_id}".format(feed_id='feed_id_example'),
        headers=headers,
        json=catalogs_feeds_update_request,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_items_batch_get(client: TestClient):
    """Test case for items_batch_get

    Get catalogs items batch
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/catalogs/items/batch/{batch_id}".format(batch_id='595953100599279259-66753b9bb65c46c49bd8503b27fecf9e'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_items_batch_post(client: TestClient):
    """Test case for items_batch_post

    Perform an operation on an item batch
    """
    catalogs_items_batch_request = {"country":"US","language":"EN","operation":"UPDATE","items":[{"item_id":"DS0294-M","attributes":{"custom_label_4":"Man hat","custom_label_3":"Woman dress","custom_label_2":"Winter sales","shipping_width":"16 in","custom_label_1":"Summer promotion","color":"blue","gender":"unisex","item_group_id":"DS0294","link":"https://www.example.com/cat/womens-clothing/denim-shirt-0294","pattern":"plaid","additional_image_link":["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"],"description":"Casual fit denim shirt made with the finest quality Japanese denim.","availability":"in stock","number_of_reviews":10,"custom_label_0":"Best sellers","title":"Women’s denim shirt, large","average_review_rating":5,"shipping":"US:CA:Ground:0 USD","price":"24.99 USD","ad_link":"https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest","mobile_link":"https://m.example.com/cat/womens-clothing/denim-shirt-0294","id":"DS0294-L","min_ad_price":"19.99 USD","brand":"Josie’s Denim","google_product_category":"Apparel & Accessories > Clothing > Shirts & Tops","gtin":3234567890126,"image_link":["https://scene.example.com/image/image.jpg"],"size_type":"regular","age_group":"newborn","free_shipping_label":1,"free_shipping_limit":"35 USD","mpn":"PI12345NTEREST","tax":"US:1025433:6.00:y","sale_price":"14.99 USD","shipping_height":"12 in","condition":"new","product_type":"Clothing > Women’s > Shirts > Denim","last_updated_time":1641483432072,"material":"cotton","size":"M","size_system":"US","number_of_ratings":10,"shipping_weight":"3 kg","adult":1}},{"item_id":"DS0294-M","attributes":{"custom_label_4":"Man hat","custom_label_3":"Woman dress","custom_label_2":"Winter sales","shipping_width":"16 in","custom_label_1":"Summer promotion","color":"blue","gender":"unisex","item_group_id":"DS0294","link":"https://www.example.com/cat/womens-clothing/denim-shirt-0294","pattern":"plaid","additional_image_link":["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"],"description":"Casual fit denim shirt made with the finest quality Japanese denim.","availability":"in stock","number_of_reviews":10,"custom_label_0":"Best sellers","title":"Women’s denim shirt, large","average_review_rating":5,"shipping":"US:CA:Ground:0 USD","price":"24.99 USD","ad_link":"https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest","mobile_link":"https://m.example.com/cat/womens-clothing/denim-shirt-0294","id":"DS0294-L","min_ad_price":"19.99 USD","brand":"Josie’s Denim","google_product_category":"Apparel & Accessories > Clothing > Shirts & Tops","gtin":3234567890126,"image_link":["https://scene.example.com/image/image.jpg"],"size_type":"regular","age_group":"newborn","free_shipping_label":1,"free_shipping_limit":"35 USD","mpn":"PI12345NTEREST","tax":"US:1025433:6.00:y","sale_price":"14.99 USD","shipping_height":"12 in","condition":"new","product_type":"Clothing > Women’s > Shirts > Denim","last_updated_time":1641483432072,"material":"cotton","size":"M","size_system":"US","number_of_ratings":10,"shipping_weight":"3 kg","adult":1}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/catalogs/items/batch",
        headers=headers,
        json=catalogs_items_batch_request,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_items_get(client: TestClient):
    """Test case for items_get

    Get catalogs items
    """
    params = [("country", 'US'),     ("item_ids", ['CR123']),     ("language", 'EN')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/catalogs/items",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

