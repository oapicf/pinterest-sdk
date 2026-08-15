//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Account {
  /// Returns a new [Account] instance.
  Account({
    this.about,
    this.accountType,
    this.boardCount,
    this.businessName,
    this.followerCount,
    this.followingCount,
    this.id,
    this.monthlyViews,
    this.pinCount,
    this.profileImage,
    this.username,
    this.websiteUrl,
  });

  /// Profile about description.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? about;

  /// Type of account
  AccountAccountTypeEnum? accountType;

  /// User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  int? boardCount;

  String? businessName;

  /// User account follower count.
  int? followerCount;

  /// User account following count.
  int? followingCount;

  /// User account ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// User account monthly views.
  int? monthlyViews;

  /// User account pin count. This includes both created and saved pins.
  int? pinCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? profileImage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? username;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? websiteUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Account &&
    other.about == about &&
    other.accountType == accountType &&
    other.boardCount == boardCount &&
    other.businessName == businessName &&
    other.followerCount == followerCount &&
    other.followingCount == followingCount &&
    other.id == id &&
    other.monthlyViews == monthlyViews &&
    other.pinCount == pinCount &&
    other.profileImage == profileImage &&
    other.username == username &&
    other.websiteUrl == websiteUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (about == null ? 0 : about!.hashCode) +
    (accountType == null ? 0 : accountType!.hashCode) +
    (boardCount == null ? 0 : boardCount!.hashCode) +
    (businessName == null ? 0 : businessName!.hashCode) +
    (followerCount == null ? 0 : followerCount!.hashCode) +
    (followingCount == null ? 0 : followingCount!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (monthlyViews == null ? 0 : monthlyViews!.hashCode) +
    (pinCount == null ? 0 : pinCount!.hashCode) +
    (profileImage == null ? 0 : profileImage!.hashCode) +
    (username == null ? 0 : username!.hashCode) +
    (websiteUrl == null ? 0 : websiteUrl!.hashCode);

  @override
  String toString() => 'Account[about=$about, accountType=$accountType, boardCount=$boardCount, businessName=$businessName, followerCount=$followerCount, followingCount=$followingCount, id=$id, monthlyViews=$monthlyViews, pinCount=$pinCount, profileImage=$profileImage, username=$username, websiteUrl=$websiteUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.about != null) {
      json[r'about'] = this.about;
    } else {
      json[r'about'] = null;
    }
    if (this.accountType != null) {
      json[r'account_type'] = this.accountType;
    } else {
      json[r'account_type'] = null;
    }
    if (this.boardCount != null) {
      json[r'board_count'] = this.boardCount;
    } else {
      json[r'board_count'] = null;
    }
    if (this.businessName != null) {
      json[r'business_name'] = this.businessName;
    } else {
      json[r'business_name'] = null;
    }
    if (this.followerCount != null) {
      json[r'follower_count'] = this.followerCount;
    } else {
      json[r'follower_count'] = null;
    }
    if (this.followingCount != null) {
      json[r'following_count'] = this.followingCount;
    } else {
      json[r'following_count'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.monthlyViews != null) {
      json[r'monthly_views'] = this.monthlyViews;
    } else {
      json[r'monthly_views'] = null;
    }
    if (this.pinCount != null) {
      json[r'pin_count'] = this.pinCount;
    } else {
      json[r'pin_count'] = null;
    }
    if (this.profileImage != null) {
      json[r'profile_image'] = this.profileImage;
    } else {
      json[r'profile_image'] = null;
    }
    if (this.username != null) {
      json[r'username'] = this.username;
    } else {
      json[r'username'] = null;
    }
    if (this.websiteUrl != null) {
      json[r'website_url'] = this.websiteUrl;
    } else {
      json[r'website_url'] = null;
    }
    return json;
  }

  /// Returns a new [Account] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Account? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Account[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Account[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Account(
        about: mapValueOfType<String>(json, r'about'),
        accountType: AccountAccountTypeEnum.fromJson(json[r'account_type']),
        boardCount: mapValueOfType<int>(json, r'board_count'),
        businessName: mapValueOfType<String>(json, r'business_name'),
        followerCount: mapValueOfType<int>(json, r'follower_count'),
        followingCount: mapValueOfType<int>(json, r'following_count'),
        id: mapValueOfType<String>(json, r'id'),
        monthlyViews: mapValueOfType<int>(json, r'monthly_views'),
        pinCount: mapValueOfType<int>(json, r'pin_count'),
        profileImage: mapValueOfType<String>(json, r'profile_image'),
        username: mapValueOfType<String>(json, r'username'),
        websiteUrl: mapValueOfType<String>(json, r'website_url'),
      );
    }
    return null;
  }

  static List<Account> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Account>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Account.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Account> mapFromJson(dynamic json) {
    final map = <String, Account>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Account.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Account-objects as value to a dart map
  static Map<String, List<Account>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Account>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Account.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Type of account
class AccountAccountTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AccountAccountTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PINNER = AccountAccountTypeEnum._(r'PINNER');
  static const BUSINESS = AccountAccountTypeEnum._(r'BUSINESS');

  /// List of all possible values in this [enum][AccountAccountTypeEnum].
  static const values = <AccountAccountTypeEnum>[
    PINNER,
    BUSINESS,
  ];

  static AccountAccountTypeEnum? fromJson(dynamic value) => AccountAccountTypeEnumTypeTransformer().decode(value);

  static List<AccountAccountTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AccountAccountTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AccountAccountTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AccountAccountTypeEnum] to String,
/// and [decode] dynamic data back to [AccountAccountTypeEnum].
class AccountAccountTypeEnumTypeTransformer {
  factory AccountAccountTypeEnumTypeTransformer() => _instance ??= const AccountAccountTypeEnumTypeTransformer._();

  const AccountAccountTypeEnumTypeTransformer._();

  String encode(AccountAccountTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AccountAccountTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AccountAccountTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PINNER': return AccountAccountTypeEnum.PINNER;
        case r'BUSINESS': return AccountAccountTypeEnum.BUSINESS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AccountAccountTypeEnumTypeTransformer] instance.
  static AccountAccountTypeEnumTypeTransformer? _instance;
}


