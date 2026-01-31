import unittest
import pinterestsdk
from pinterestsdk.rest import ApiException
from pprint import pprint

class TestPinterestSdkBoards(unittest.TestCase):

    def test_boards_list_pins_unauthorized(self):
        """Test boards_list_pins API call with invalid token should fail with 401 Unauthorized"""

        configuration = pinterestsdk.Configuration(
            host = "https://api.pinterest.com/v5",
            access_token = "SOME INVALID TOKEN"
        )

        with pinterestsdk.ApiClient(configuration) as api_client:

            api_instance = pinterestsdk.BoardsApi(api_client)
            board_id = '12345'

            try:
                api_response = api_instance.boards_list_pins(board_id)
                self.fail('API called successfully when it should have failed')
            except ApiException as e:
                print("Exception when calling BoardsApi->boards_list_pins: %s\n" % e)
                self.assertEqual(e.status, 401)

if __name__ == '__main__':
    unittest.main()
