//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_type.g.dart';

class InviteType extends EnumClass {

  /// The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
  @BuiltValueEnumConst(wireName: r'MEMBER_INVITE')
  static const InviteType MEMBER_INVITE = _$MEMBER_INVITE;
  /// The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
  @BuiltValueEnumConst(wireName: r'PARTNER_INVITE')
  static const InviteType PARTNER_INVITE = _$PARTNER_INVITE;
  /// The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
  @BuiltValueEnumConst(wireName: r'PARTNER_REQUEST')
  static const InviteType PARTNER_REQUEST = _$PARTNER_REQUEST;

  static Serializer<InviteType> get serializer => _$inviteTypeSerializer;

  const InviteType._(String name): super(name);

  static BuiltSet<InviteType> get values => _$values;
  static InviteType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class InviteTypeMixin = Object with _$InviteTypeMixin;

