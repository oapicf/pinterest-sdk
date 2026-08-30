(ns pinterest-rest-api.specs.invite-action-result-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-exception-response :refer :all]
            [pinterest-rest-api.specs.invite-business-role-binding :refer :all]
            )
  (:import (java.io File)))


(def invite-action-result-item-data
  {
   (ds/opt :exception) invite-exception-response-spec
   (ds/opt :invite) invite-business-role-binding-spec
   })

(def invite-action-result-item-spec
  (ds/spec
    {:name ::invite-action-result-item
     :spec invite-action-result-item-data}))
