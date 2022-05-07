{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Boards where

import           Import


-- | Create board section
--
-- Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boardSections/create
postBoardsByTextSectionsR :: Text -- ^ Unique identifier of a board.
                          -> Handler Value
postBoardsByTextSectionsR boardId = notImplemented

-- | Delete board section
--
-- Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boardSections/delete
deleteBoardsByTextSectionsByTextR :: Text -- ^ Unique identifier of a board.
                                  -> Text -- ^ Unique identifier of a board section.
                                  -> Handler Value
deleteBoardsByTextSectionsByTextR boardId sectionId = notImplemented

-- | List board sections
--
-- Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boardSections/list
getBoardsByTextSectionsR :: Text -- ^ Unique identifier of a board.
                         -> Handler Value
getBoardsByTextSectionsR boardId = notImplemented

-- | List Pins on board section
--
-- Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boardSections/listPins
getBoardsByTextSectionsByTextPinsR :: Text -- ^ Unique identifier of a board.
                                   -> Text -- ^ Unique identifier of a board section.
                                   -> Handler Value
getBoardsByTextSectionsByTextPinsR boardId sectionId = notImplemented

-- | Update board section
--
-- Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boardSections/update
patchBoardsByTextSectionsByTextR :: Text -- ^ Unique identifier of a board.
                                 -> Text -- ^ Unique identifier of a board section.
                                 -> Handler Value
patchBoardsByTextSectionsByTextR boardId sectionId = notImplemented

-- | Create board
--
-- Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boards/create
postBoardsR :: Handler Value
postBoardsR = notImplemented

-- | Delete board
--
-- Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boards/delete
deleteBoardsByTextR :: Text -- ^ Unique identifier of a board.
                    -> Handler Value
deleteBoardsByTextR boardId = notImplemented

-- | Get board
--
-- Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boards/get
getBoardsByTextR :: Text -- ^ Unique identifier of a board.
                 -> Handler Value
getBoardsByTextR boardId = notImplemented

-- | List boards
--
-- Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
-- operationId: boards/list
getBoardsR :: Handler Value
getBoardsR = notImplemented

-- | List Pins on board
--
-- Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
-- operationId: boards/listPins
getBoardsByTextPinsR :: Text -- ^ Unique identifier of a board.
                     -> Handler Value
getBoardsByTextPinsR boardId = notImplemented

-- | Update board
--
-- Update a board owned by the \&quot;operating user_account\&quot;.
-- operationId: boards/update
patchBoardsByTextR :: Text -- ^ Unique identifier of a board.
                   -> Handler Value
patchBoardsByTextR boardId = notImplemented
