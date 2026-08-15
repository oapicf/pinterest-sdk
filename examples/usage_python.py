import pinterestsdk
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5",
    access_token = "YOUR_PINTEREST_ACCESS_TOKEN"
)

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BoardsApi(api_client)
    board_id = 'board_id'

    try:
        # List pins on a board
        api_response = api_instance.boards_list_pins(board_id)
        print("The response of BoardsApi->boards_list_pins:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BoardsApi->boards_list_pins: %s\n" % e)
        raise
