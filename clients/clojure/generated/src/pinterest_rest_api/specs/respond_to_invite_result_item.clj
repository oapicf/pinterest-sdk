(ns pinterest-rest-api.specs.respond-to-invite-result-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-exception-response :refer :all]
            [pinterest-rest-api.specs.base-invite-data-response :refer :all]
            )
  (:import (java.io File)))


(def respond-to-invite-result-item-data
  {
   (ds/opt :exception) invite-exception-response-spec
   (ds/opt :invite) base-invite-data-response-spec
   })

(def respond-to-invite-result-item-spec
  (ds/spec
    {:name ::respond-to-invite-result-item
     :spec respond-to-invite-result-item-data}))
