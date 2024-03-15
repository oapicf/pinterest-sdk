#' Create a new BulkUpsertRequestCreate
#'
#' @description
#' Request for creation of entities in bulk.
#'
#' @docType class
#' @title BulkUpsertRequestCreate
#' @description BulkUpsertRequestCreate Class
#' @format An \code{R6Class} generator object
#' @field campaigns  list(\link{CampaignCreateRequest}) [optional]
#' @field ad_groups  list(\link{AdGroupCreateRequest}) [optional]
#' @field ads  list(\link{AdCreateRequest}) [optional]
#' @field product_groups  list(\link{ProductGroupPromotionCreateRequest}) [optional]
#' @field keywords  list(\link{KeywordsRequest}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertRequestCreate <- R6::R6Class(
  "BulkUpsertRequestCreate",
  public = list(
    `campaigns` = NULL,
    `ad_groups` = NULL,
    `ads` = NULL,
    `product_groups` = NULL,
    `keywords` = NULL,
    #' Initialize a new BulkUpsertRequestCreate class.
    #'
    #' @description
    #' Initialize a new BulkUpsertRequestCreate class.
    #'
    #' @param campaigns campaigns
    #' @param ad_groups ad_groups
    #' @param ads ads
    #' @param product_groups product_groups
    #' @param keywords keywords
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertRequestCreate in JSON format
    #' @export
    toJSON = function() {
      BulkUpsertRequestCreateObject <- list()
      if (!is.null(self$`campaigns`)) {
        BulkUpsertRequestCreateObject[["campaigns"]] <-
          lapply(self$`campaigns`, function(x) x$toJSON())
      }
      if (!is.null(self$`ad_groups`)) {
        BulkUpsertRequestCreateObject[["ad_groups"]] <-
          lapply(self$`ad_groups`, function(x) x$toJSON())
      }
      if (!is.null(self$`ads`)) {
        BulkUpsertRequestCreateObject[["ads"]] <-
          lapply(self$`ads`, function(x) x$toJSON())
      }
      if (!is.null(self$`product_groups`)) {
        BulkUpsertRequestCreateObject[["product_groups"]] <-
          lapply(self$`product_groups`, function(x) x$toJSON())
      }
      if (!is.null(self$`keywords`)) {
        BulkUpsertRequestCreateObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      BulkUpsertRequestCreateObject
    },
    #' Deserialize JSON string into an instance of BulkUpsertRequestCreate
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestCreate
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaigns`)) {
        self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_groups`)) {
        self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ads`)) {
        self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_groups`)) {
        self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordsRequest]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertRequestCreate in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of BulkUpsertRequestCreate
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestCreate
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignCreateRequest]", loadNamespace("openapi"))
      self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupCreateRequest]", loadNamespace("openapi"))
      self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdCreateRequest]", loadNamespace("openapi"))
      self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionCreateRequest]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordsRequest]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to BulkUpsertRequestCreate
    #'
    #' @description
    #' Validate JSON input with respect to BulkUpsertRequestCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkUpsertRequestCreate
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# BulkUpsertRequestCreate$unlock()
#
## Below is an example to define the print function
# BulkUpsertRequestCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertRequestCreate$lock()

