#' Create a new Account
#'
#' @description
#' Account Class
#'
#' @docType class
#' @title Account
#' @description Account Class
#' @format An \code{R6Class} generator object
#' @field account_type Type of account character [optional]
#' @field id User account ID. character [optional]
#' @field profile_image  character [optional]
#' @field website_url  character [optional]
#' @field username  character [optional]
#' @field about Profile about description. character [optional]
#' @field business_name  character [optional]
#' @field board_count User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. integer [optional]
#' @field pin_count User account pin count. This includes both created and saved pins. integer [optional]
#' @field follower_count User account follower count. integer [optional]
#' @field following_count User account following count. integer [optional]
#' @field monthly_views User account monthly views. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Account <- R6::R6Class(
  "Account",
  public = list(
    `account_type` = NULL,
    `id` = NULL,
    `profile_image` = NULL,
    `website_url` = NULL,
    `username` = NULL,
    `about` = NULL,
    `business_name` = NULL,
    `board_count` = NULL,
    `pin_count` = NULL,
    `follower_count` = NULL,
    `following_count` = NULL,
    `monthly_views` = NULL,

    #' @description
    #' Initialize a new Account class.
    #'
    #' @param account_type Type of account
    #' @param id User account ID.
    #' @param profile_image profile_image
    #' @param website_url website_url
    #' @param username username
    #' @param about Profile about description.
    #' @param business_name business_name
    #' @param board_count User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
    #' @param pin_count User account pin count. This includes both created and saved pins.
    #' @param follower_count User account follower count.
    #' @param following_count User account following count.
    #' @param monthly_views User account monthly views.
    #' @param ... Other optional arguments.
    initialize = function(`account_type` = NULL, `id` = NULL, `profile_image` = NULL, `website_url` = NULL, `username` = NULL, `about` = NULL, `business_name` = NULL, `board_count` = NULL, `pin_count` = NULL, `follower_count` = NULL, `following_count` = NULL, `monthly_views` = NULL, ...) {
      if (!is.null(`account_type`)) {
        if (!(`account_type` %in% c("PINNER", "BUSINESS"))) {
          stop(paste("Error! \"", `account_type`, "\" cannot be assigned to `account_type`. Must be \"PINNER\", \"BUSINESS\".", sep = ""))
        }
        if (!(is.character(`account_type`) && length(`account_type`) == 1)) {
          stop(paste("Error! Invalid data for `account_type`. Must be a string:", `account_type`))
        }
        self$`account_type` <- `account_type`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`profile_image`)) {
        if (!(is.character(`profile_image`) && length(`profile_image`) == 1)) {
          stop(paste("Error! Invalid data for `profile_image`. Must be a string:", `profile_image`))
        }
        self$`profile_image` <- `profile_image`
      }
      if (!is.null(`website_url`)) {
        if (!(is.character(`website_url`) && length(`website_url`) == 1)) {
          stop(paste("Error! Invalid data for `website_url`. Must be a string:", `website_url`))
        }
        self$`website_url` <- `website_url`
      }
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!is.null(`about`)) {
        if (!(is.character(`about`) && length(`about`) == 1)) {
          stop(paste("Error! Invalid data for `about`. Must be a string:", `about`))
        }
        self$`about` <- `about`
      }
      if (!is.null(`business_name`)) {
        if (!(is.character(`business_name`) && length(`business_name`) == 1)) {
          stop(paste("Error! Invalid data for `business_name`. Must be a string:", `business_name`))
        }
        self$`business_name` <- `business_name`
      }
      if (!is.null(`board_count`)) {
        if (!(is.numeric(`board_count`) && length(`board_count`) == 1)) {
          stop(paste("Error! Invalid data for `board_count`. Must be an integer:", `board_count`))
        }
        self$`board_count` <- `board_count`
      }
      if (!is.null(`pin_count`)) {
        if (!(is.numeric(`pin_count`) && length(`pin_count`) == 1)) {
          stop(paste("Error! Invalid data for `pin_count`. Must be an integer:", `pin_count`))
        }
        self$`pin_count` <- `pin_count`
      }
      if (!is.null(`follower_count`)) {
        if (!(is.numeric(`follower_count`) && length(`follower_count`) == 1)) {
          stop(paste("Error! Invalid data for `follower_count`. Must be an integer:", `follower_count`))
        }
        self$`follower_count` <- `follower_count`
      }
      if (!is.null(`following_count`)) {
        if (!(is.numeric(`following_count`) && length(`following_count`) == 1)) {
          stop(paste("Error! Invalid data for `following_count`. Must be an integer:", `following_count`))
        }
        self$`following_count` <- `following_count`
      }
      if (!is.null(`monthly_views`)) {
        if (!(is.numeric(`monthly_views`) && length(`monthly_views`) == 1)) {
          stop(paste("Error! Invalid data for `monthly_views`. Must be an integer:", `monthly_views`))
        }
        self$`monthly_views` <- `monthly_views`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return Account in JSON format
    toJSON = function() {
      AccountObject <- list()
      if (!is.null(self$`account_type`)) {
        AccountObject[["account_type"]] <-
          self$`account_type`
      }
      if (!is.null(self$`id`)) {
        AccountObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`profile_image`)) {
        AccountObject[["profile_image"]] <-
          self$`profile_image`
      }
      if (!is.null(self$`website_url`)) {
        AccountObject[["website_url"]] <-
          self$`website_url`
      }
      if (!is.null(self$`username`)) {
        AccountObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`about`)) {
        AccountObject[["about"]] <-
          self$`about`
      }
      if (!is.null(self$`business_name`)) {
        AccountObject[["business_name"]] <-
          self$`business_name`
      }
      if (!is.null(self$`board_count`)) {
        AccountObject[["board_count"]] <-
          self$`board_count`
      }
      if (!is.null(self$`pin_count`)) {
        AccountObject[["pin_count"]] <-
          self$`pin_count`
      }
      if (!is.null(self$`follower_count`)) {
        AccountObject[["follower_count"]] <-
          self$`follower_count`
      }
      if (!is.null(self$`following_count`)) {
        AccountObject[["following_count"]] <-
          self$`following_count`
      }
      if (!is.null(self$`monthly_views`)) {
        AccountObject[["monthly_views"]] <-
          self$`monthly_views`
      }
      AccountObject
    },

    #' @description
    #' Deserialize JSON string into an instance of Account
    #'
    #' @param input_json the JSON input
    #' @return the instance of Account
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`account_type`)) {
        if (!is.null(this_object$`account_type`) && !(this_object$`account_type` %in% c("PINNER", "BUSINESS"))) {
          stop(paste("Error! \"", this_object$`account_type`, "\" cannot be assigned to `account_type`. Must be \"PINNER\", \"BUSINESS\".", sep = ""))
        }
        self$`account_type` <- this_object$`account_type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`profile_image`)) {
        self$`profile_image` <- this_object$`profile_image`
      }
      if (!is.null(this_object$`website_url`)) {
        self$`website_url` <- this_object$`website_url`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      if (!is.null(this_object$`about`)) {
        self$`about` <- this_object$`about`
      }
      if (!is.null(this_object$`business_name`)) {
        self$`business_name` <- this_object$`business_name`
      }
      if (!is.null(this_object$`board_count`)) {
        self$`board_count` <- this_object$`board_count`
      }
      if (!is.null(this_object$`pin_count`)) {
        self$`pin_count` <- this_object$`pin_count`
      }
      if (!is.null(this_object$`follower_count`)) {
        self$`follower_count` <- this_object$`follower_count`
      }
      if (!is.null(this_object$`following_count`)) {
        self$`following_count` <- this_object$`following_count`
      }
      if (!is.null(this_object$`monthly_views`)) {
        self$`monthly_views` <- this_object$`monthly_views`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return Account in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`account_type`)) {
          sprintf(
          '"account_type":
            "%s"
                    ',
          self$`account_type`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`profile_image`)) {
          sprintf(
          '"profile_image":
            "%s"
                    ',
          self$`profile_image`
          )
        },
        if (!is.null(self$`website_url`)) {
          sprintf(
          '"website_url":
            "%s"
                    ',
          self$`website_url`
          )
        },
        if (!is.null(self$`username`)) {
          sprintf(
          '"username":
            "%s"
                    ',
          self$`username`
          )
        },
        if (!is.null(self$`about`)) {
          sprintf(
          '"about":
            "%s"
                    ',
          self$`about`
          )
        },
        if (!is.null(self$`business_name`)) {
          sprintf(
          '"business_name":
            "%s"
                    ',
          self$`business_name`
          )
        },
        if (!is.null(self$`board_count`)) {
          sprintf(
          '"board_count":
            %d
                    ',
          self$`board_count`
          )
        },
        if (!is.null(self$`pin_count`)) {
          sprintf(
          '"pin_count":
            %d
                    ',
          self$`pin_count`
          )
        },
        if (!is.null(self$`follower_count`)) {
          sprintf(
          '"follower_count":
            %d
                    ',
          self$`follower_count`
          )
        },
        if (!is.null(self$`following_count`)) {
          sprintf(
          '"following_count":
            %d
                    ',
          self$`following_count`
          )
        },
        if (!is.null(self$`monthly_views`)) {
          sprintf(
          '"monthly_views":
            %d
                    ',
          self$`monthly_views`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of Account
    #'
    #' @param input_json the JSON input
    #' @return the instance of Account
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`account_type`) && !(this_object$`account_type` %in% c("PINNER", "BUSINESS"))) {
        stop(paste("Error! \"", this_object$`account_type`, "\" cannot be assigned to `account_type`. Must be \"PINNER\", \"BUSINESS\".", sep = ""))
      }
      self$`account_type` <- this_object$`account_type`
      self$`id` <- this_object$`id`
      self$`profile_image` <- this_object$`profile_image`
      self$`website_url` <- this_object$`website_url`
      self$`username` <- this_object$`username`
      self$`about` <- this_object$`about`
      self$`business_name` <- this_object$`business_name`
      self$`board_count` <- this_object$`board_count`
      self$`pin_count` <- this_object$`pin_count`
      self$`follower_count` <- this_object$`follower_count`
      self$`following_count` <- this_object$`following_count`
      self$`monthly_views` <- this_object$`monthly_views`
      self
    },

    #' @description
    #' Validate JSON input with respect to Account and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Account
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# Account$unlock()
#
## Below is an example to define the print function
# Account$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Account$lock()

