#' Create a new BulkUpsertRequestUpdate
#'
#' @description
#' Request for creation of entities in bulk.
#'
#' @docType class
#' @title BulkUpsertRequestUpdate
#' @description BulkUpsertRequestUpdate Class
#' @format An \code{R6Class} generator object
#' @field campaigns  list(\link{CampaignUpdateRequest}) [optional]
#' @field ad_groups  list(\link{AdGroupUpdateRequest}) [optional]
#' @field ads  list(\link{AdUpdateRequest}) [optional]
#' @field product_groups  list(\link{ProductGroupPromotionUpdateRequest}) [optional]
#' @field keywords  list(\link{KeywordUpdate}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertRequestUpdate <- R6::R6Class(
  "BulkUpsertRequestUpdate",
  public = list(
    `campaigns` = NULL,
    `ad_groups` = NULL,
    `ads` = NULL,
    `product_groups` = NULL,
    `keywords` = NULL,

    #' @description
    #' Initialize a new BulkUpsertRequestUpdate class.
    #'
    #' @param campaigns campaigns
    #' @param ad_groups ad_groups
    #' @param ads ads
    #' @param product_groups product_groups
    #' @param keywords keywords
    #' @param ... Other optional arguments.
    initialize = function(`campaigns` = NULL, `ad_groups` = NULL, `ads` = NULL, `product_groups` = NULL, `keywords` = NULL, ...) {
      if (!is.null(`campaigns`)) {
        stopifnot(is.vector(`campaigns`), length(`campaigns`) != 0)
        sapply(`campaigns`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaigns` <- `campaigns`
      }
      if (!is.null(`ad_groups`)) {
        stopifnot(is.vector(`ad_groups`), length(`ad_groups`) != 0)
        sapply(`ad_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`ad_groups` <- `ad_groups`
      }
      if (!is.null(`ads`)) {
        stopifnot(is.vector(`ads`), length(`ads`) != 0)
        sapply(`ads`, function(x) stopifnot(R6::is.R6(x)))
        self$`ads` <- `ads`
      }
      if (!is.null(`product_groups`)) {
        stopifnot(is.vector(`product_groups`), length(`product_groups`) != 0)
        sapply(`product_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`product_groups` <- `product_groups`
      }
      if (!is.null(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertRequestUpdate in JSON format
    toJSON = function() {
      BulkUpsertRequestUpdateObject <- list()
      if (!is.null(self$`campaigns`)) {
        BulkUpsertRequestUpdateObject[["campaigns"]] <-
          lapply(self$`campaigns`, function(x) x$toJSON())
      }
      if (!is.null(self$`ad_groups`)) {
        BulkUpsertRequestUpdateObject[["ad_groups"]] <-
          lapply(self$`ad_groups`, function(x) x$toJSON())
      }
      if (!is.null(self$`ads`)) {
        BulkUpsertRequestUpdateObject[["ads"]] <-
          lapply(self$`ads`, function(x) x$toJSON())
      }
      if (!is.null(self$`product_groups`)) {
        BulkUpsertRequestUpdateObject[["product_groups"]] <-
          lapply(self$`product_groups`, function(x) x$toJSON())
      }
      if (!is.null(self$`keywords`)) {
        BulkUpsertRequestUpdateObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      BulkUpsertRequestUpdateObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequestUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaigns`)) {
        self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_groups`)) {
        self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ads`)) {
        self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_groups`)) {
        self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordUpdate]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertRequestUpdate in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaigns`)) {
          sprintf(
          '"campaigns":
          [%s]
',
          paste(sapply(self$`campaigns`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`ad_groups`)) {
          sprintf(
          '"ad_groups":
          [%s]
',
          paste(sapply(self$`ad_groups`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`ads`)) {
          sprintf(
          '"ads":
          [%s]
',
          paste(sapply(self$`ads`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`product_groups`)) {
          sprintf(
          '"product_groups":
          [%s]
',
          paste(sapply(self$`product_groups`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`keywords`)) {
          sprintf(
          '"keywords":
          [%s]
',
          paste(sapply(self$`keywords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequestUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignUpdateRequest]", loadNamespace("openapi"))
      self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupUpdateRequest]", loadNamespace("openapi"))
      self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdUpdateRequest]", loadNamespace("openapi"))
      self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionUpdateRequest]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordUpdate]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkUpsertRequestUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkUpsertRequestUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# BulkUpsertRequestUpdate$unlock()
#
## Below is an example to define the print function
# BulkUpsertRequestUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertRequestUpdate$lock()

