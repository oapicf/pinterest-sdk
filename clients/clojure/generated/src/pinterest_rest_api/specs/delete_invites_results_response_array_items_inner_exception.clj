(ns pinterest-rest-api.specs.delete-invites-results-response-array-items-inner-exception
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-invites-results-response-array-items-inner-exception-data
  {
   (ds/opt :invite_id) string?
   (ds/opt :message) string?
   })

(def delete-invites-results-response-array-items-inner-exception-spec
  (ds/spec
    {:name ::delete-invites-results-response-array-items-inner-exception
     :spec delete-invites-results-response-array-items-inner-exception-data}))
