#' Create a new AdvancedAuctionProcessedItems
#'
#' @description
#' Response object containing the results of an operation on an item bid option
#'
#' @docType class
#' @title AdvancedAuctionProcessedItems
#' @description AdvancedAuctionProcessedItems Class
#' @format An \code{R6Class} generator object
#' @field catalog_id Catalog id pertaining to all items character [optional]
#' @field items Array of advanced auction processed items list(\link{AdvancedAuctionProcessedItem}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvancedAuctionProcessedItems <- R6::R6Class(
  "AdvancedAuctionProcessedItems",
  public = list(
    `catalog_id` = NULL,
    `items` = NULL,

    #' @description
    #' Initialize a new AdvancedAuctionProcessedItems class.
    #'
    #' @param catalog_id Catalog id pertaining to all items
    #' @param items Array of advanced auction processed items
    #' @param ... Other optional arguments.
    initialize = function(`catalog_id` = NULL, `items` = NULL, ...) {
      if (!is.null(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionProcessedItems in JSON format
    toJSON = function() {
      AdvancedAuctionProcessedItemsObject <- list()
      if (!is.null(self$`catalog_id`)) {
        AdvancedAuctionProcessedItemsObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`items`)) {
        AdvancedAuctionProcessedItemsObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      AdvancedAuctionProcessedItemsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvancedAuctionProcessedItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionProcessedItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AdvancedAuctionProcessedItem]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdvancedAuctionProcessedItems in JSON format
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
    #' Deserialize JSON string into an instance of AdvancedAuctionProcessedItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvancedAuctionProcessedItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_id` <- this_object$`catalog_id`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AdvancedAuctionProcessedItem]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvancedAuctionProcessedItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvancedAuctionProcessedItems
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
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
      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
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
# AdvancedAuctionProcessedItems$unlock()
#
## Below is an example to define the print function
# AdvancedAuctionProcessedItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvancedAuctionProcessedItems$lock()

