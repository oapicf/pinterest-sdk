#' Create a new AdvancedAuctionItemsGetRequest
#'
#' @description
#' Request object used to get bid options values for a batch of retail catalog items
#'
#' @docType class
#' @title AdvancedAuctionItemsGetRequest
#' @description AdvancedAuctionItemsGetRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_id Catalog id pertaining to the retail item character
#' @field items A list of retail catalog items to fetch bid options for list(\link{AdvancedAuctionItemsGetRecord})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvancedAuctionItemsGetRequest <- R6::R6Class(
  "AdvancedAuctionItemsGetRequest",
  public = list(
    `catalog_id` = NULL,
    `items` = NULL,

    #' @description
    #' Initialize a new AdvancedAuctionItemsGetRequest class.
    #'
    #' @param catalog_id Catalog id pertaining to the retail item
    #' @param items A list of retail catalog items to fetch bid options for
    #' @param ... Other optional arguments.
    initialize = function(`catalog_id`, `items`, ...) {
      if (!missing(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionItemsGetRequest in JSON format
    toJSON = function() {
      AdvancedAuctionItemsGetRequestObject <- list()
      if (!is.null(self$`catalog_id`)) {
        AdvancedAuctionItemsGetRequestObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`items`)) {
        AdvancedAuctionItemsGetRequestObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      AdvancedAuctionItemsGetRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionItemsGetRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionItemsGetRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AdvancedAuctionItemsGetRecord]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionItemsGetRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_id`)) {
          sprintf(
          '"catalog_id":
            "%s"
                    ',
          self$`catalog_id`
          )
        },
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionItemsGetRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionItemsGetRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_id` <- this_object$`catalog_id`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AdvancedAuctionItemsGetRecord]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvancedAuctionItemsGetRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_id`
      if (!is.null(input_json$`catalog_id`)) {
        if (!(is.character(input_json$`catalog_id`) && length(input_json$`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", input_json$`catalog_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsGetRequest: the required field `catalog_id` is missing."))
      }
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdvancedAuctionItemsGetRequest: the required field `items` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvancedAuctionItemsGetRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) > 10000) {
        return(FALSE)
      }
      if (length(self$`items`) < 1) {
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
      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        invalid_fields["catalog_id"] <- "Non-nullable required field `catalog_id` cannot be null."
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) > 10000) {
        invalid_fields["items"] <- "Invalid length for `items`, number of items must be less than or equal to 10000."
      }
      if (length(self$`items`) < 1) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# AdvancedAuctionItemsGetRequest$unlock()
#
## Below is an example to define the print function
# AdvancedAuctionItemsGetRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvancedAuctionItemsGetRequest$lock()

