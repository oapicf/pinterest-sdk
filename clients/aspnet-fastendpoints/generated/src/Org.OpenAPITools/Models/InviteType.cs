namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
    /// </summary>
    /// <value>The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.</value>
    public enum InviteType
    {
        
        /// <summary>
        /// Enum MEMBERINVITEEnum for MEMBER_INVITE
        /// </summary>
        MEMBERINVITEEnum = 1,
        
        /// <summary>
        /// Enum PARTNERINVITEEnum for PARTNER_INVITE
        /// </summary>
        PARTNERINVITEEnum = 2,
        
        /// <summary>
        /// Enum PARTNERREQUESTEnum for PARTNER_REQUEST
        /// </summary>
        PARTNERREQUESTEnum = 3
    }
