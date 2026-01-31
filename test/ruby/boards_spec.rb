require 'time'
require 'pinterest_sdk'

describe 'PinterestSdkClient' do
  before do
  end

  after do
  end

  describe 'test boards_list_pins with invalid token' do
    it 'should respond with error 401 unauthorized' do
      PinterestSdkClient.configure do |config|
        config.access_token = 'SOME INVALID TOKEN'
      end

      api_instance = PinterestSdkClient::BoardsApi.new
      board_id = '12345'

      begin
        result = api_instance.boards_list_pins(board_id)
        fail 'API called successfully when it should have failed'
      rescue PinterestSdkClient::ApiError => e
        puts "Error when calling BoardsApi->boards_list_pins: #{e}"
        expect(e.code).to eq(401)
      end
    end
  end

end
