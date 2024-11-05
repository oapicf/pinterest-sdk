#' Create a new AdvancedAuctionItemsSubmitUpsertRecord
#'
#' @description
#' Object describing an item bid option upsert operation
#'
#' @docType class
#' @title AdvancedAuctionItemsSubmitUpsertRecord
#' @description AdvancedAuctionItemsSubmitUpsertRecord Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog retail item id in the merchant namespace character
#' @field country  \link{Country}
#' @field language  \link{Language}
#' @field bid_options  \link{AdvancedAuctionBidOptions}
#' @field update_mask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. list(\link{UpdateMaskBidOptionField})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvancedAuctionItemsSubmitUpsertRecord <- R6::R6Class(
  "AdvancedAuctionItemsSubmitUpsertRecord",
  public = list(
    `item_id` = NULL,
    `country` = NULL,
    `language` = NULL,
    `bid_options` = NULL,
    `update_mask` = NULL,

    #' @description
    #' Initialize a new AdvancedAuctionItemsSubmitUpsertRecord class.
    #'
    #' @param item_id The catalog retail item id in the merchant namespace
    #' @param country country
    #' @param language language
    #' @param bid_options bid_options
    #' @param update_mask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
    #' @param ... Other optional arguments.
    initialize = function(`item_id`, `country`, `language`, `bid_options`, `update_mask`, ...) {
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`language`)) {
        if (!(`language` %in% c())) {
          stop(paste("Error! \"", `language`, "\" cannot be assigned to `language`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
      }
      if (!missing(`bid_options`)) {
        stopifnot(R6::is.R6(`bid_options`))
        self$`bid_options` <- `bid_options`
      }
      if (!missing(`update_mask`)) {
        stopifnot(is.vector(`update_mask`), length(`update_mask`) != 0)
        sapply(`update_mask`, function(x) stopifnot(R6::is.R6(x)))
        self$`update_mask` <- `update_mask`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionItemsSubmitUpsertRecord in JSON format
    toJSON = function() {
      AdvancedAuctionItemsSubmitUpsertRecordObject <- list()
      if (!is.null(self$`item_id`)) {
        AdvancedAuctionItemsSubmitUpsertRecordObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`country`)) {
        AdvancedAuctionItemsSubmitUpsertRecordObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`language`)) {
        AdvancedAuctionItemsSubmitUpsertRecordObject[["language"]] <-
          self$`language`$toJSON()
      }
      if (!is.null(self$`bid_options`)) {
        AdvancedAuctionItemsSubmitUpsertRecordObject[["bid_options"]] <-
          self$`bid_options`$toJSON()
      }
      if (!is.null(self$`update_mask`)) {
        AdvancedAuctionItemsSubmitUpsertRecordObject[["update_mask"]] <-
          lapply(self$`update_mask`, function(x) x$toJSON())
      }
      AdvancedAuctionItemsSubmitUpsertRecordObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionItemsSubmitUpsertRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionItemsSubmitUpsertRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`language`)) {
        `language_object` <- Language$new()
        `language_object`$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
        self$`language` <- `language_object`
      }
      if (!is.null(this_object$`bid_options`)) {
        `bid_options_object` <- AdvancedAuctionBidOptions$new()
        `bid_options_object`$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
        self$`bid_options` <- `bid_options_object`
      }
      if (!is.null(this_object$`update_mask`)) {
        self$`update_mask` <- ApiClient$new()$deserializeObj(this_object$`update_mask`, "array[UpdateMaskBidOptionField]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionItemsSubmitUpsertRecord in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        },
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
          %s
          ',
          jsonlite::toJSON(self$`country`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`language`)) {
          sprintf(
          '"language":
          %s
          ',
          jsonlite::toJSON(self$`language`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`bid_options`)) {
          sprintf(
          '"bid_options":
          %s
          ',
          jsonlite::toJSON(self$`bid_options`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`update_mask`)) {
          sprintf(
          '"update_mask":
          [%s]
',
          paste(sapply(self$`update_mask`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionItemsSubmitUpsertRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionItemsSubmitUpsertRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`language` <- Language$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self$`bid_options` <- AdvancedAuctionBidOptions$new()$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
      self$`update_mask` <- ApiClient$new()$deserializeObj(this_object$`update_mask`, "array[UpdateMaskBidOptionField]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvancedAuctionItemsSubmitUpsertRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsSubmitUpsertRecord: the required field `item_id` is missing."))
      }
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsSubmitUpsertRecord: the required field `country` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsSubmitUpsertRecord: the required field `language` is missing."))
      }
      # check the required field `bid_options`
      if (!is.null(input_json$`bid_options`)) {
        stopifnot(R6::is.R6(input_json$`bid_options`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsSubmitUpsertRecord: the required field `bid_options` is missing."))
      }
      # check the required field `update_mask`
      if (!is.null(input_json$`update_mask`)) {
        stopifnot(is.vector(input_json$`update_mask`), length(input_json$`update_mask`) != 0)
        tmp <- sapply(input_json$`update_mask`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsSubmitUpsertRecord: the required field `update_mask` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvancedAuctionItemsSubmitUpsertRecord
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        return(FALSE)
      }

      # check if the required `bid_options` is null
      if (is.null(self$`bid_options`)) {
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
      }

      # check if the required `bid_options` is null
      if (is.null(self$`bid_options`)) {
        invalid_fields["bid_options"] <- "Non-nullable required field `bid_options` cannot be null."
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
# AdvancedAuctionItemsSubmitUpsertRecord$unlock()
#
## Below is an example to define the print function
# AdvancedAuctionItemsSubmitUpsertRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvancedAuctionItemsSubmitUpsertRecord$lock()

