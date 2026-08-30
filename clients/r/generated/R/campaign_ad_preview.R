#' Create a new CampaignAdPreview
#'
#' @description
#' Campaign ad preview record.
#'
#' @docType class
#' @title CampaignAdPreview
#' @description CampaignAdPreview Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Advertiser ID for this preview. character
#' @field ad_group_id Ad group ID to create a preview record for. character
#' @field client_id Client ID that created preview. integer [optional]
#' @field expires_at Unix timestamp in milliseconds for preview expiration. integer
#' @field is_active Whether preview link is active. character
#' @field pin_id Pin ID for pin promotion preview. integer [optional]
#' @field pin_promotion_id Pin promotion ID for this preview. integer [optional]
#' @field promoted_product_group_id Promoted product group ID for catalog previews. integer [optional]
#' @field url Campaign ad preview URL. character
#' @field user_id User ID that created preview. integer
#' @field uuid Pin promotion preview key. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignAdPreview <- R6::R6Class(
  "CampaignAdPreview",
  public = list(
    `ad_account_id` = NULL,
    `ad_group_id` = NULL,
    `client_id` = NULL,
    `expires_at` = NULL,
    `is_active` = NULL,
    `pin_id` = NULL,
    `pin_promotion_id` = NULL,
    `promoted_product_group_id` = NULL,
    `url` = NULL,
    `user_id` = NULL,
    `uuid` = NULL,

    #' @description
    #' Initialize a new CampaignAdPreview class.
    #'
    #' @param ad_account_id Advertiser ID for this preview.
    #' @param ad_group_id Ad group ID to create a preview record for.
    #' @param expires_at Unix timestamp in milliseconds for preview expiration.
    #' @param is_active Whether preview link is active.
    #' @param url Campaign ad preview URL.
    #' @param user_id User ID that created preview.
    #' @param uuid Pin promotion preview key.
    #' @param client_id Client ID that created preview.
    #' @param pin_id Pin ID for pin promotion preview.
    #' @param pin_promotion_id Pin promotion ID for this preview.
    #' @param promoted_product_group_id Promoted product group ID for catalog previews.
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id`, `ad_group_id`, `expires_at`, `is_active`, `url`, `user_id`, `uuid`, `client_id` = NULL, `pin_id` = NULL, `pin_promotion_id` = NULL, `promoted_product_group_id` = NULL, ...) {
      if (!missing(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!missing(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!missing(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
      }
      if (!missing(`is_active`)) {
        if (!(is.logical(`is_active`) && length(`is_active`) == 1)) {
          stop(paste("Error! Invalid data for `is_active`. Must be a boolean:", `is_active`))
        }
        self$`is_active` <- `is_active`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!missing(`user_id`)) {
        if (!(is.numeric(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be an integer:", `user_id`))
        }
        self$`user_id` <- `user_id`
      }
      if (!missing(`uuid`)) {
        if (!(is.character(`uuid`) && length(`uuid`) == 1)) {
          stop(paste("Error! Invalid data for `uuid`. Must be a string:", `uuid`))
        }
        self$`uuid` <- `uuid`
      }
      if (!is.null(`client_id`)) {
        if (!(is.numeric(`client_id`) && length(`client_id`) == 1)) {
          stop(paste("Error! Invalid data for `client_id`. Must be an integer:", `client_id`))
        }
        self$`client_id` <- `client_id`
      }
      if (!is.null(`pin_id`)) {
        if (!(is.numeric(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be an integer:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
      }
      if (!is.null(`pin_promotion_id`)) {
        if (!(is.numeric(`pin_promotion_id`) && length(`pin_promotion_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_promotion_id`. Must be an integer:", `pin_promotion_id`))
        }
        self$`pin_promotion_id` <- `pin_promotion_id`
      }
      if (!is.null(`promoted_product_group_id`)) {
        if (!(is.numeric(`promoted_product_group_id`) && length(`promoted_product_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `promoted_product_group_id`. Must be an integer:", `promoted_product_group_id`))
        }
        self$`promoted_product_group_id` <- `promoted_product_group_id`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CampaignAdPreview as a base R list.
    #' @examples
    #' # convert array of CampaignAdPreview (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CampaignAdPreview to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignAdPreviewObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CampaignAdPreviewObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`ad_group_id`)) {
        CampaignAdPreviewObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`client_id`)) {
        CampaignAdPreviewObject[["client_id"]] <-
          self$`client_id`
      }
      if (!is.null(self$`expires_at`)) {
        CampaignAdPreviewObject[["expires_at"]] <-
          self$`expires_at`
      }
      if (!is.null(self$`is_active`)) {
        CampaignAdPreviewObject[["is_active"]] <-
          self$`is_active`
      }
      if (!is.null(self$`pin_id`)) {
        CampaignAdPreviewObject[["pin_id"]] <-
          self$`pin_id`
      }
      if (!is.null(self$`pin_promotion_id`)) {
        CampaignAdPreviewObject[["pin_promotion_id"]] <-
          self$`pin_promotion_id`
      }
      if (!is.null(self$`promoted_product_group_id`)) {
        CampaignAdPreviewObject[["promoted_product_group_id"]] <-
          self$`promoted_product_group_id`
      }
      if (!is.null(self$`url`)) {
        CampaignAdPreviewObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`user_id`)) {
        CampaignAdPreviewObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`uuid`)) {
        CampaignAdPreviewObject[["uuid"]] <-
          self$`uuid`
      }
      return(CampaignAdPreviewObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignAdPreview
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignAdPreview
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`client_id`)) {
        self$`client_id` <- this_object$`client_id`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      if (!is.null(this_object$`is_active`)) {
        self$`is_active` <- this_object$`is_active`
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      if (!is.null(this_object$`pin_promotion_id`)) {
        self$`pin_promotion_id` <- this_object$`pin_promotion_id`
      }
      if (!is.null(this_object$`promoted_product_group_id`)) {
        self$`promoted_product_group_id` <- this_object$`promoted_product_group_id`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      if (!is.null(this_object$`uuid`)) {
        self$`uuid` <- this_object$`uuid`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignAdPreview in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignAdPreview
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignAdPreview
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`ad_group_id` <- this_object$`ad_group_id`
      self$`client_id` <- this_object$`client_id`
      self$`expires_at` <- this_object$`expires_at`
      self$`is_active` <- this_object$`is_active`
      self$`pin_id` <- this_object$`pin_id`
      self$`pin_promotion_id` <- this_object$`pin_promotion_id`
      self$`promoted_product_group_id` <- this_object$`promoted_product_group_id`
      self$`url` <- this_object$`url`
      self$`user_id` <- this_object$`user_id`
      self$`uuid` <- this_object$`uuid`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignAdPreview and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_account_id`
      if (!is.null(input_json$`ad_account_id`)) {
        if (!(is.character(input_json$`ad_account_id`) && length(input_json$`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", input_json$`ad_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `ad_account_id` is missing."))
      }
      # check the required field `ad_group_id`
      if (!is.null(input_json$`ad_group_id`)) {
        if (!(is.character(input_json$`ad_group_id`) && length(input_json$`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", input_json$`ad_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `ad_group_id` is missing."))
      }
      # check the required field `expires_at`
      if (!is.null(input_json$`expires_at`)) {
        if (!(is.numeric(input_json$`expires_at`) && length(input_json$`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", input_json$`expires_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `expires_at` is missing."))
      }
      # check the required field `is_active`
      if (!is.null(input_json$`is_active`)) {
        if (!(is.logical(input_json$`is_active`) && length(input_json$`is_active`) == 1)) {
          stop(paste("Error! Invalid data for `is_active`. Must be a boolean:", input_json$`is_active`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `is_active` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `url` is missing."))
      }
      # check the required field `user_id`
      if (!is.null(input_json$`user_id`)) {
        if (!(is.numeric(input_json$`user_id`) && length(input_json$`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be an integer:", input_json$`user_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `user_id` is missing."))
      }
      # check the required field `uuid`
      if (!is.null(input_json$`uuid`)) {
        if (!(is.character(input_json$`uuid`) && length(input_json$`uuid`) == 1)) {
          stop(paste("Error! Invalid data for `uuid`. Must be a string:", input_json$`uuid`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreview: the required field `uuid` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignAdPreview
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        return(FALSE)
      }

      if (nchar(self$`ad_group_id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`ad_group_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `expires_at` is null
      if (is.null(self$`expires_at`)) {
        return(FALSE)
      }

      # check if the required `is_active` is null
      if (is.null(self$`is_active`)) {
        return(FALSE)
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        return(FALSE)
      }

      # check if the required `user_id` is null
      if (is.null(self$`user_id`)) {
        return(FALSE)
      }

      # check if the required `uuid` is null
      if (is.null(self$`uuid`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        invalid_fields["ad_account_id"] <- "Non-nullable required field `ad_account_id` cannot be null."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        invalid_fields["ad_group_id"] <- "Non-nullable required field `ad_group_id` cannot be null."
      }

      if (nchar(self$`ad_group_id`) > 18) {
        invalid_fields["ad_group_id"] <- "Invalid length for `ad_group_id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`ad_group_id`, "^\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `expires_at` is null
      if (is.null(self$`expires_at`)) {
        invalid_fields["expires_at"] <- "Non-nullable required field `expires_at` cannot be null."
      }

      # check if the required `is_active` is null
      if (is.null(self$`is_active`)) {
        invalid_fields["is_active"] <- "Non-nullable required field `is_active` cannot be null."
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
      }

      # check if the required `user_id` is null
      if (is.null(self$`user_id`)) {
        invalid_fields["user_id"] <- "Non-nullable required field `user_id` cannot be null."
      }

      # check if the required `uuid` is null
      if (is.null(self$`uuid`)) {
        invalid_fields["uuid"] <- "Non-nullable required field `uuid` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CampaignAdPreview$unlock()
#
## Below is an example to define the print function
# CampaignAdPreview$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignAdPreview$lock()

