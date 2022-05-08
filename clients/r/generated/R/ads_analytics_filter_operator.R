# Pinterest REST API
#
# Pinterest's REST API
#
# The version of the OpenAPI document: 5.3.0
# Contact: pinterest-api@pinterest.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title AdsAnalyticsFilterOperator
#'
#' @description AdsAnalyticsFilterOperator Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsFilterOperator <- R6::R6Class(
    "AdsAnalyticsFilterOperator",
    public = list(
        initialize = function(...) {
            local.optional.var <- list(...)
            val <- unlist(local.optional.var)
            enumvec <- .parse_AdsAnalyticsFilterOperator()

            stopifnot(length(val) == 1L)

            if (!val %in% enumvec)
                stop("Use one of the valid values: ",
                    paste0(enumvec, collapse = ", "))
            private$value <- val
        },
        toJSON = function() {
            jsonlite::toJSON(private$value, auto_unbox = TRUE)
        },
        fromJSON = function(AdsAnalyticsFilterOperatorJson) {
            private$value <- jsonlite::fromJSON(AdsAnalyticsFilterOperatorJson,
                simplifyVector = FALSE)
            self
        },
        toJSONString = function() {
            as.character(jsonlite::toJSON(private$value,
                auto_unbox = TRUE))
        },
        fromJSONString = function(AdsAnalyticsFilterOperatorJson) {
            private$value <- jsonlite::fromJSON(AdsAnalyticsFilterOperatorJson,
                simplifyVector = FALSE)
            self
        }
    ),
    private = list(
        value = NULL
    )
)

# add to utils.R
.parse_AdsAnalyticsFilterOperator <- function(vals) {
    res <- gsub("^\\[|\\]$", "",
        "[LESS_THAN, GREATER_THAN]"
    )
    unlist(strsplit(res, ", "))
}
