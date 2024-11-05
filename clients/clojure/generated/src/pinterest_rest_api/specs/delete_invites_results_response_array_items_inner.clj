(ns pinterest-rest-api.specs.delete-invites-results-response-array-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-invites-results-response-array-items-inner-exception :refer :all]
            [pinterest-rest-api.specs.base-invite-data-response :refer :all]
            )
  (:import (java.io File)))


(def delete-invites-results-response-array-items-inner-data
  {
   (ds/opt :exception) delete-invites-results-response-array-items-inner-exception-spec
   (ds/opt :invite) base-invite-data-response-spec
   })

(def delete-invites-results-response-array-items-inner-spec
  (ds/spec
    {:name ::delete-invites-results-response-array-items-inner
     :spec delete-invites-results-response-array-items-inner-data}))
