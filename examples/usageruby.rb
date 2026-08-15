# Load the gem
require 'pinterest_sdk'

PinterestSdkClient.configure do |config|
  config.access_token = 'YOUR_PINTEREST_ACCESS_TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id'

begin
  # List pins on a board
  result = api_instance.boards_list_pins(board_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Exception when calling BoardsApi->boards_list_pins: #{e}"
  raise
end
