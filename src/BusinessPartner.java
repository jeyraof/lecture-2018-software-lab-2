import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class BusinessPartner extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenant;
	private JTextField txtOrganization;
	private JTextField txtSearchKey;
	private JTextField txtName;
	private JTextField txtName_1;
	private JTextField txtDescription;
	private JTextField txtOpenBalance;
	private JTextField txtReferenceNo;
	private JTextField txtNaicssic;
	private JTextField txtTaxId;
	private JTextField txtDuns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusinessPartner frame = new BusinessPartner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BusinessPartner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		contentPane.add(verticalStrut, gbc_verticalStrut);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		contentPane.add(horizontalStrut, gbc_horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_1.gridx = 32;
		gbc_horizontalStrut_1.gridy = 2;
		contentPane.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 23;
		gbc_tabbedPane.gridwidth = 29;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 3;
		gbc_tabbedPane.gridy = 1;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel_business_partner = new JPanel();
		tabbedPane.addTab("Business Partner", null, panel_business_partner, null);
		GridBagLayout gbl_panel_business_partner = new GridBagLayout();
		gbl_panel_business_partner.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_business_partner.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_business_partner.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_business_partner.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_business_partner.setLayout(gbl_panel_business_partner);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 0;
		panel_business_partner.add(verticalStrut_2, gbc_verticalStrut_2);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6 = new GridBagConstraints();
		gbc_horizontalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_6.gridx = 19;
		gbc_horizontalStrut_6.gridy = 0;
		panel_business_partner.add(horizontalStrut_6, gbc_horizontalStrut_6);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 0;
		gbc_horizontalStrut_2.gridy = 1;
		panel_business_partner.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		JLabel lblTenant = new JLabel("Tenant");
		GridBagConstraints gbc_lblTenant = new GridBagConstraints();
		gbc_lblTenant.anchor = GridBagConstraints.EAST;
		gbc_lblTenant.insets = new Insets(0, 0, 5, 5);
		gbc_lblTenant.gridx = 2;
		gbc_lblTenant.gridy = 2;
		panel_business_partner.add(lblTenant, gbc_lblTenant);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_3.gridx = 3;
		gbc_horizontalStrut_3.gridy = 2;
		panel_business_partner.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		txtTenant = new JTextField();
		txtTenant.setEnabled(false);
		txtTenant.setText("GardenWorld");
		GridBagConstraints gbc_txtTenant = new GridBagConstraints();
		gbc_txtTenant.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTenant.insets = new Insets(0, 0, 5, 5);
		gbc_txtTenant.gridx = 4;
		gbc_txtTenant.gridy = 2;
		panel_business_partner.add(txtTenant, gbc_txtTenant);
		txtTenant.setColumns(10);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_4.gridx = 10;
		gbc_horizontalStrut_4.gridy = 2;
		panel_business_partner.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		JLabel lblOrganization = new JLabel("Organization");
		GridBagConstraints gbc_lblOrganization = new GridBagConstraints();
		gbc_lblOrganization.anchor = GridBagConstraints.EAST;
		gbc_lblOrganization.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrganization.gridx = 11;
		gbc_lblOrganization.gridy = 2;
		panel_business_partner.add(lblOrganization, gbc_lblOrganization);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5.gridx = 12;
		gbc_horizontalStrut_5.gridy = 2;
		panel_business_partner.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		txtOrganization = new JTextField();
		txtOrganization.setEnabled(false);
		txtOrganization.setText("*");
		GridBagConstraints gbc_txtOrganization = new GridBagConstraints();
		gbc_txtOrganization.insets = new Insets(0, 0, 5, 5);
		gbc_txtOrganization.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOrganization.gridx = 13;
		gbc_txtOrganization.gridy = 2;
		panel_business_partner.add(txtOrganization, gbc_txtOrganization);
		txtOrganization.setColumns(10);
		
		JLabel lblSearchKey = new JLabel("Search Key");
		GridBagConstraints gbc_lblSearchKey = new GridBagConstraints();
		gbc_lblSearchKey.anchor = GridBagConstraints.EAST;
		gbc_lblSearchKey.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearchKey.gridx = 2;
		gbc_lblSearchKey.gridy = 3;
		panel_business_partner.add(lblSearchKey, gbc_lblSearchKey);
		
		txtSearchKey = new JTextField();
		txtSearchKey.setText("Search Key");
		GridBagConstraints gbc_txtSearchKey = new GridBagConstraints();
		gbc_txtSearchKey.insets = new Insets(0, 0, 5, 5);
		gbc_txtSearchKey.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchKey.gridx = 4;
		gbc_txtSearchKey.gridy = 3;
		panel_business_partner.add(txtSearchKey, gbc_txtSearchKey);
		txtSearchKey.setColumns(10);
		
		JLabel lblGreeting = new JLabel("Greeting");
		GridBagConstraints gbc_lblGreeting = new GridBagConstraints();
		gbc_lblGreeting.anchor = GridBagConstraints.EAST;
		gbc_lblGreeting.insets = new Insets(0, 0, 5, 5);
		gbc_lblGreeting.gridx = 2;
		gbc_lblGreeting.gridy = 4;
		panel_business_partner.add(lblGreeting, gbc_lblGreeting);
		
		JComboBox cbGreeting = new JComboBox();
		cbGreeting.setModel(new DefaultComboBoxModel(new String[] {"Mr", "Ms"}));
		GridBagConstraints gbc_cbGreeting = new GridBagConstraints();
		gbc_cbGreeting.insets = new Insets(0, 0, 5, 5);
		gbc_cbGreeting.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGreeting.gridx = 4;
		gbc_cbGreeting.gridy = 4;
		panel_business_partner.add(cbGreeting, gbc_cbGreeting);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 2;
		gbc_lblName.gridy = 5;
		panel_business_partner.add(lblName, gbc_lblName);
		
		txtName = new JTextField();
		txtName.setBackground(new Color(238, 232, 170));
		txtName.setText("C&W Construction");
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.gridwidth = 10;
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 4;
		gbc_txtName.gridy = 5;
		panel_business_partner.add(txtName, gbc_txtName);
		txtName.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name 2");
		GridBagConstraints gbc_lblName_1 = new GridBagConstraints();
		gbc_lblName_1.anchor = GridBagConstraints.EAST;
		gbc_lblName_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblName_1.gridx = 2;
		gbc_lblName_1.gridy = 6;
		panel_business_partner.add(lblName_1, gbc_lblName_1);
		
		txtName_1 = new JTextField();
		txtName_1.setText("Unlimited Projects Corp");
		GridBagConstraints gbc_txtName_1 = new GridBagConstraints();
		gbc_txtName_1.gridwidth = 10;
		gbc_txtName_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtName_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName_1.gridx = 4;
		gbc_txtName_1.gridy = 6;
		panel_business_partner.add(txtName_1, gbc_txtName_1);
		txtName_1.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.EAST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 2;
		gbc_lblDescription.gridy = 7;
		panel_business_partner.add(lblDescription, gbc_lblDescription);
		
		txtDescription = new JTextField();
		txtDescription.setText("Description");
		GridBagConstraints gbc_txtDescription = new GridBagConstraints();
		gbc_txtDescription.gridwidth = 10;
		gbc_txtDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescription.gridx = 4;
		gbc_txtDescription.gridy = 7;
		panel_business_partner.add(txtDescription, gbc_txtDescription);
		txtDescription.setColumns(10);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 2;
		gbc_verticalStrut_3.gridy = 8;
		panel_business_partner.add(verticalStrut_3, gbc_verticalStrut_3);
		
		JCheckBox chckbxActive = new JCheckBox("Active");
		GridBagConstraints gbc_chckbxActive = new GridBagConstraints();
		gbc_chckbxActive.anchor = GridBagConstraints.WEST;
		gbc_chckbxActive.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxActive.gridx = 4;
		gbc_chckbxActive.gridy = 8;
		panel_business_partner.add(chckbxActive, gbc_chckbxActive);
		
		JCheckBox chckbxSummaryLevel = new JCheckBox("Summary Level");
		GridBagConstraints gbc_chckbxSummaryLevel = new GridBagConstraints();
		gbc_chckbxSummaryLevel.anchor = GridBagConstraints.WEST;
		gbc_chckbxSummaryLevel.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSummaryLevel.gridx = 13;
		gbc_chckbxSummaryLevel.gridy = 8;
		panel_business_partner.add(chckbxSummaryLevel, gbc_chckbxSummaryLevel);
		
		JLabel lblCreditStatus = new JLabel("Credit Status");
		GridBagConstraints gbc_lblCreditStatus = new GridBagConstraints();
		gbc_lblCreditStatus.anchor = GridBagConstraints.EAST;
		gbc_lblCreditStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreditStatus.gridx = 2;
		gbc_lblCreditStatus.gridy = 9;
		panel_business_partner.add(lblCreditStatus, gbc_lblCreditStatus);
		
		JComboBox cbCreditStatus = new JComboBox();
		cbCreditStatus.setModel(new DefaultComboBoxModel(new String[] {"Credit OK"}));
		GridBagConstraints gbc_cbCreditStatus = new GridBagConstraints();
		gbc_cbCreditStatus.insets = new Insets(0, 0, 5, 5);
		gbc_cbCreditStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbCreditStatus.gridx = 4;
		gbc_cbCreditStatus.gridy = 9;
		panel_business_partner.add(cbCreditStatus, gbc_cbCreditStatus);
		
		JLabel lblOpenBalance = new JLabel("Open Balance");
		GridBagConstraints gbc_lblOpenBalance = new GridBagConstraints();
		gbc_lblOpenBalance.anchor = GridBagConstraints.EAST;
		gbc_lblOpenBalance.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpenBalance.gridx = 11;
		gbc_lblOpenBalance.gridy = 9;
		panel_business_partner.add(lblOpenBalance, gbc_lblOpenBalance);
		
		txtOpenBalance = new JTextField();
		txtOpenBalance.setEnabled(false);
		txtOpenBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOpenBalance.setText("-551.38");
		GridBagConstraints gbc_txtOpenBalance = new GridBagConstraints();
		gbc_txtOpenBalance.anchor = GridBagConstraints.WEST;
		gbc_txtOpenBalance.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpenBalance.gridx = 13;
		gbc_txtOpenBalance.gridy = 9;
		panel_business_partner.add(txtOpenBalance, gbc_txtOpenBalance);
		txtOpenBalance.setColumns(10);
		
		JLabel lblTaxId = new JLabel("Tax ID");
		GridBagConstraints gbc_lblTaxId = new GridBagConstraints();
		gbc_lblTaxId.anchor = GridBagConstraints.EAST;
		gbc_lblTaxId.insets = new Insets(0, 0, 5, 5);
		gbc_lblTaxId.gridx = 2;
		gbc_lblTaxId.gridy = 10;
		panel_business_partner.add(lblTaxId, gbc_lblTaxId);
		
		txtTaxId = new JTextField();
		txtTaxId.setText("Tax ID");
		GridBagConstraints gbc_txtTaxId = new GridBagConstraints();
		gbc_txtTaxId.insets = new Insets(0, 0, 5, 5);
		gbc_txtTaxId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTaxId.gridx = 4;
		gbc_txtTaxId.gridy = 10;
		panel_business_partner.add(txtTaxId, gbc_txtTaxId);
		txtTaxId.setColumns(10);
		
		JCheckBox chckbxTaxExempt = new JCheckBox("Tax exempt");
		GridBagConstraints gbc_chckbxTaxExempt = new GridBagConstraints();
		gbc_chckbxTaxExempt.anchor = GridBagConstraints.WEST;
		gbc_chckbxTaxExempt.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxTaxExempt.gridx = 13;
		gbc_chckbxTaxExempt.gridy = 10;
		panel_business_partner.add(chckbxTaxExempt, gbc_chckbxTaxExempt);
		
		JLabel lblDuns = new JLabel("D-U-N-S");
		GridBagConstraints gbc_lblDuns = new GridBagConstraints();
		gbc_lblDuns.anchor = GridBagConstraints.EAST;
		gbc_lblDuns.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuns.gridx = 2;
		gbc_lblDuns.gridy = 11;
		panel_business_partner.add(lblDuns, gbc_lblDuns);
		
		txtDuns = new JTextField();
		txtDuns.setText("DUNS");
		GridBagConstraints gbc_txtDuns = new GridBagConstraints();
		gbc_txtDuns.insets = new Insets(0, 0, 5, 5);
		gbc_txtDuns.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDuns.gridx = 4;
		gbc_txtDuns.gridy = 11;
		panel_business_partner.add(txtDuns, gbc_txtDuns);
		txtDuns.setColumns(10);
		
		JLabel lblReferenceNo = new JLabel("Reference No");
		GridBagConstraints gbc_lblReferenceNo = new GridBagConstraints();
		gbc_lblReferenceNo.anchor = GridBagConstraints.EAST;
		gbc_lblReferenceNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblReferenceNo.gridx = 11;
		gbc_lblReferenceNo.gridy = 11;
		panel_business_partner.add(lblReferenceNo, gbc_lblReferenceNo);
		
		txtReferenceNo = new JTextField();
		txtReferenceNo.setText("BP Ref No 123");
		GridBagConstraints gbc_txtReferenceNo = new GridBagConstraints();
		gbc_txtReferenceNo.insets = new Insets(0, 0, 5, 5);
		gbc_txtReferenceNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtReferenceNo.gridx = 13;
		gbc_txtReferenceNo.gridy = 11;
		panel_business_partner.add(txtReferenceNo, gbc_txtReferenceNo);
		txtReferenceNo.setColumns(10);
		
		JLabel lblIndustryCode = new JLabel("Industry Code");
		GridBagConstraints gbc_lblIndustryCode = new GridBagConstraints();
		gbc_lblIndustryCode.anchor = GridBagConstraints.EAST;
		gbc_lblIndustryCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndustryCode.gridx = 2;
		gbc_lblIndustryCode.gridy = 12;
		panel_business_partner.add(lblIndustryCode, gbc_lblIndustryCode);
		
		JComboBox cbIndustryCode = new JComboBox();
		GridBagConstraints gbc_cbIndustryCode = new GridBagConstraints();
		gbc_cbIndustryCode.insets = new Insets(0, 0, 5, 5);
		gbc_cbIndustryCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbIndustryCode.gridx = 4;
		gbc_cbIndustryCode.gridy = 12;
		panel_business_partner.add(cbIndustryCode, gbc_cbIndustryCode);
		
		JLabel lblNaicssic = new JLabel("NAICS/SIC");
		GridBagConstraints gbc_lblNaicssic = new GridBagConstraints();
		gbc_lblNaicssic.anchor = GridBagConstraints.EAST;
		gbc_lblNaicssic.insets = new Insets(0, 0, 5, 5);
		gbc_lblNaicssic.gridx = 11;
		gbc_lblNaicssic.gridy = 12;
		panel_business_partner.add(lblNaicssic, gbc_lblNaicssic);
		
		txtNaicssic = new JTextField();
		GridBagConstraints gbc_txtNaicssic = new GridBagConstraints();
		gbc_txtNaicssic.insets = new Insets(0, 0, 5, 5);
		gbc_txtNaicssic.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNaicssic.gridx = 13;
		gbc_txtNaicssic.gridy = 12;
		panel_business_partner.add(txtNaicssic, gbc_txtNaicssic);
		txtNaicssic.setColumns(10);
		
		JLabel lblBpStatus = new JLabel("BP Status");
		GridBagConstraints gbc_lblBpStatus = new GridBagConstraints();
		gbc_lblBpStatus.anchor = GridBagConstraints.EAST;
		gbc_lblBpStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblBpStatus.gridx = 2;
		gbc_lblBpStatus.gridy = 13;
		panel_business_partner.add(lblBpStatus, gbc_lblBpStatus);
		
		JComboBox cbBpStatus = new JComboBox();
		GridBagConstraints gbc_cbBpStatus = new GridBagConstraints();
		gbc_cbBpStatus.insets = new Insets(0, 0, 5, 5);
		gbc_cbBpStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBpStatus.gridx = 4;
		gbc_cbBpStatus.gridy = 13;
		panel_business_partner.add(cbBpStatus, gbc_cbBpStatus);
		
		JLabel lblRating = new JLabel("Rating");
		GridBagConstraints gbc_lblRating = new GridBagConstraints();
		gbc_lblRating.anchor = GridBagConstraints.EAST;
		gbc_lblRating.insets = new Insets(0, 0, 5, 5);
		gbc_lblRating.gridx = 11;
		gbc_lblRating.gridy = 13;
		panel_business_partner.add(lblRating, gbc_lblRating);
		
		JComboBox cbRating = new JComboBox();
		GridBagConstraints gbc_cbRating = new GridBagConstraints();
		gbc_cbRating.insets = new Insets(0, 0, 5, 5);
		gbc_cbRating.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbRating.gridx = 13;
		gbc_cbRating.gridy = 13;
		panel_business_partner.add(cbRating, gbc_cbRating);
		
		JLabel lblBusinessPartnerGroup = new JLabel("Business Partner Group");
		GridBagConstraints gbc_lblBusinessPartnerGroup = new GridBagConstraints();
		gbc_lblBusinessPartnerGroup.anchor = GridBagConstraints.EAST;
		gbc_lblBusinessPartnerGroup.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusinessPartnerGroup.gridx = 2;
		gbc_lblBusinessPartnerGroup.gridy = 14;
		panel_business_partner.add(lblBusinessPartnerGroup, gbc_lblBusinessPartnerGroup);
		
		JComboBox cbBusinessPartnerGroup = new JComboBox();
		cbBusinessPartnerGroup.setBackground(new Color(238, 232, 170));
		cbBusinessPartnerGroup.setModel(new DefaultComboBoxModel(new String[] {"Major Account"}));
		GridBagConstraints gbc_cbBusinessPartnerGroup = new GridBagConstraints();
		gbc_cbBusinessPartnerGroup.insets = new Insets(0, 0, 5, 5);
		gbc_cbBusinessPartnerGroup.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBusinessPartnerGroup.gridx = 4;
		gbc_cbBusinessPartnerGroup.gridy = 14;
		panel_business_partner.add(cbBusinessPartnerGroup, gbc_cbBusinessPartnerGroup);
		
		JLabel lblLanguage = new JLabel("Language");
		GridBagConstraints gbc_lblLanguage = new GridBagConstraints();
		gbc_lblLanguage.anchor = GridBagConstraints.EAST;
		gbc_lblLanguage.insets = new Insets(0, 0, 5, 5);
		gbc_lblLanguage.gridx = 11;
		gbc_lblLanguage.gridy = 14;
		panel_business_partner.add(lblLanguage, gbc_lblLanguage);
		
		JComboBox cbLanguage = new JComboBox();
		GridBagConstraints gbc_cbLanguage = new GridBagConstraints();
		gbc_cbLanguage.insets = new Insets(0, 0, 5, 5);
		gbc_cbLanguage.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbLanguage.gridx = 13;
		gbc_cbLanguage.gridy = 14;
		panel_business_partner.add(cbLanguage, gbc_cbLanguage);
		
		JLabel lblUrl = new JLabel("URL");
		GridBagConstraints gbc_lblUrl = new GridBagConstraints();
		gbc_lblUrl.anchor = GridBagConstraints.EAST;
		gbc_lblUrl.insets = new Insets(0, 0, 5, 5);
		gbc_lblUrl.gridx = 2;
		gbc_lblUrl.gridy = 15;
		panel_business_partner.add(lblUrl, gbc_lblUrl);
		
		JComboBox cbURL = new JComboBox();
		cbURL.setModel(new DefaultComboBoxModel(new String[] {"Standard Customers"}));
		GridBagConstraints gbc_cbURL = new GridBagConstraints();
		gbc_cbURL.insets = new Insets(0, 0, 5, 5);
		gbc_cbURL.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbURL.gridx = 4;
		gbc_cbURL.gridy = 15;
		panel_business_partner.add(cbURL, gbc_cbURL);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4.gridx = 2;
		gbc_verticalStrut_4.gridy = 16;
		panel_business_partner.add(verticalStrut_4, gbc_verticalStrut_4);
		
		JCheckBox chckbxProspect = new JCheckBox("Prospect");
		GridBagConstraints gbc_chckbxProspect = new GridBagConstraints();
		gbc_chckbxProspect.anchor = GridBagConstraints.WEST;
		gbc_chckbxProspect.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxProspect.gridx = 4;
		gbc_chckbxProspect.gridy = 16;
		panel_business_partner.add(chckbxProspect, gbc_chckbxProspect);
		
		JButton btnLinkOrganization = new JButton("Link Organization");
		GridBagConstraints gbc_btnLinkOrganization = new GridBagConstraints();
		gbc_btnLinkOrganization.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLinkOrganization.insets = new Insets(0, 0, 5, 5);
		gbc_btnLinkOrganization.gridx = 13;
		gbc_btnLinkOrganization.gridy = 16;
		panel_business_partner.add(btnLinkOrganization, gbc_btnLinkOrganization);
		
		JLabel lblPotentialLifeTime = new JLabel("Potential Life Time Value");
		GridBagConstraints gbc_lblPotentialLifeTime = new GridBagConstraints();
		gbc_lblPotentialLifeTime.insets = new Insets(0, 0, 0, 5);
		gbc_lblPotentialLifeTime.anchor = GridBagConstraints.EAST;
		gbc_lblPotentialLifeTime.gridx = 2;
		gbc_lblPotentialLifeTime.gridy = 17;
		panel_business_partner.add(lblPotentialLifeTime, gbc_lblPotentialLifeTime);
		
		JPanel panel_customer = new JPanel();
		tabbedPane.addTab("Customer", null, panel_customer, null);
		
		JPanel panel_vendor = new JPanel();
		tabbedPane.addTab("Vendor", null, panel_vendor, null);
		
		JPanel panel_employee = new JPanel();
		tabbedPane.addTab("Employee", null, panel_employee, null);
		
		JPanel panel_banck_account = new JPanel();
		tabbedPane.addTab("Bank Account", null, panel_banck_account, null);
		
		JPanel panel_location = new JPanel();
		tabbedPane.addTab("Location", null, panel_location, null);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_1.gridx = 2;
		gbc_verticalStrut_1.gridy = 24;
		contentPane.add(verticalStrut_1, gbc_verticalStrut_1);
	}

}
