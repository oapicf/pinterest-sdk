terraform {
  required_providers {
    example = {
      source = "registry.terraform.io/example/example"
    }
  }
}

provider "example" {
  endpoint = "https://api.pinterest.com/v5"
  # api_key  = "your-api-key"
  # token    = "your-bearer-token"
}
