(ns pinterest-rest-api.specs.cancel-invite-result-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.cancel-invite-exception :refer :all]
            [pinterest-rest-api.specs.cancel-invite-result :refer :all]
            )
  (:import (java.io File)))


(def cancel-invite-result-item-data
  {
   (ds/opt :exception) cancel-invite-exception-spec
   (ds/opt :invite) cancel-invite-result-spec
   })

(def cancel-invite-result-item-spec
  (ds/spec
    {:name ::cancel-invite-result-item
     :spec cancel-invite-result-item-data}))
